package com.nubisoft.githubsearcher.internal.service.implementations

import com.nubisoft.githubsearcher.api.dto.GithubRepositoryItemDto
import com.nubisoft.githubsearcher.api.enum.ProgrammingLanguage
import com.nubisoft.githubsearcher.internal.persistence.GithubRepoDatabase
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.LocalDate

@Service
internal class GithubService(
    private val githubClient: GithubClient,
    private val repoMapper: GithubRepositoryItemDtoMapper,
    private val repoDatabase: GithubRepoDatabase,
) {
    fun getRepositoriesByCreatedDate(createdDate: LocalDate, quantity: Int, language: ProgrammingLanguage?): Mono<List<GithubRepositoryItemDto>> {
        return githubClient
            .getRepositoriesByCreatedDate(createdDate, quantity, language)
            .map { repoMapper.toDtos(it) }
            .flatMap { modifyIfMarked(it) }
    }

    fun getRepositoryById(repositoryId: Long): Mono<GithubRepositoryItemDto> {
        return githubClient
            .getRepositoryById(repositoryId)
            .map { repoMapper.toDto(it) }
    }

    private fun modifyIfMarked(repos: List<GithubRepositoryItemDto>): Mono<List<GithubRepositoryItemDto>> {
        return Flux.fromIterable(repos)
            .flatMap { repoItem ->
                repoDatabase.get(repoItem.id)
                    .mapNotNull { repoItem.copy(marked = true) }
                    .defaultIfEmpty(repoItem)
            }
            .collectList()
    }
}
