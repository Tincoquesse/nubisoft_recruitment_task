package com.nubisoft.githubsearcher.internal.service

import com.nubisoft.githubsearcher.api.dto.GithubRepositoryItemDto
import reactor.core.publisher.Mono

interface SearcherAppService {
    fun getAllMarkedRepos(): Mono<List<GithubRepositoryItemDto>>

    fun markRepositoryById(githubRepositoryId: Int): Mono<GithubRepositoryItemDto>
}
