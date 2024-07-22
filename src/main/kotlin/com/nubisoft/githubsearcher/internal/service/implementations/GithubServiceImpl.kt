package com.nubisoft.githubsearcher.internal.service.implementations

import com.nubisoft.githubsearcher.api.dto.GithubRepositoryItemDto
import com.nubisoft.githubsearcher.api.enum.ProgrammingLanguage
import com.nubisoft.githubsearcher.internal.service.GithubService
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.time.LocalDate

@Service
internal class GithubServiceImpl(
    private val githubClient: GithubClient,
    private val repoMapper: GithubRepositoryItemDtoMapper,
) : GithubService {
    override fun getRepositoriesByCreatedDate(createdDate: LocalDate, quantity: Int, language: ProgrammingLanguage?): Mono<List<GithubRepositoryItemDto>> {
        return githubClient
            .getRepositoriesByCreatedDate(createdDate, quantity, language)
            .map { repoMapper.toDtos(it) }
    }

    override fun getRepositoryById(repositoryId: Int): Mono<GithubRepositoryItemDto> {
        return githubClient
            .getRepositoryById(repositoryId)
            .map { repoMapper.toDto(it) }
    }
}
