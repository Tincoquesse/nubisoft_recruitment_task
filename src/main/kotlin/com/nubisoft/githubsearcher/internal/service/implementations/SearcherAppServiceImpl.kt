package com.nubisoft.githubsearcher.internal.service.implementations

import com.nubisoft.githubsearcher.api.dto.GithubRepositoryItemDto
import com.nubisoft.githubsearcher.api.enum.ProgrammingLanguage
import com.nubisoft.githubsearcher.internal.exception.model.GithubClientException
import com.nubisoft.githubsearcher.internal.persistence.GithubRepoDatabase
import com.nubisoft.githubsearcher.internal.service.SearcherAppService
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.time.LocalDate

@Service
internal class SearcherAppServiceImpl(
    private val repoDatabase: GithubRepoDatabase,
    private val githubService: GithubService,
) : SearcherAppService {
    override fun getRepositoriesByCreatedDate(createdDate: LocalDate, quantity: Int, language: ProgrammingLanguage?): Mono<List<GithubRepositoryItemDto>> {
        return githubService.getRepositoriesByCreatedDate(createdDate, quantity, language)
    }

    override fun getAllMarkedRepos(): Mono<List<GithubRepositoryItemDto>> {
        return repoDatabase.getAll()
    }

    override fun markRepositoryById(githubRepositoryId: Int): Mono<GithubRepositoryItemDto> {
        return repoDatabase.get(githubRepositoryId)
            .switchIfEmpty(githubService.getRepositoryById(githubRepositoryId))
            .switchIfEmpty(Mono.error(GithubClientException("No repository with id:$githubRepositoryId found")))
            .flatMap { repo -> if (repo != null) repoDatabase.add(repo) else Mono.empty() }
    }
}
