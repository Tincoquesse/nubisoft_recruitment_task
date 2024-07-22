package com.nubisoft.githubsearcher.internal.service.implementations

import com.nubisoft.githubsearcher.api.dto.GithubRepositoryItemDto
import com.nubisoft.githubsearcher.api.enum.ProgrammingLanguage
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.time.LocalDate

@Service
internal class GithubService(
    private val githubClient: GithubClient,
    private val repoMapper: GithubRepositoryItemDtoMapper,
) {
    fun getRepositoriesByCreatedDate(createdDate: LocalDate, quantity: Int, language: ProgrammingLanguage?): Mono<List<GithubRepositoryItemDto>> {
        return githubClient
            .getRepositoriesByCreatedDate(createdDate, quantity, language)
            .map { repoMapper.toDtos(it) }
    }

    fun getRepositoryById(repositoryId: Long): Mono<GithubRepositoryItemDto> {
        return githubClient
            .getRepositoryById(repositoryId)
            .map { repoMapper.toDto(it) }
    }
}
