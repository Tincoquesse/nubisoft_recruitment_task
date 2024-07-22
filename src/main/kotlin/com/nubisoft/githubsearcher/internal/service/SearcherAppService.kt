package com.nubisoft.githubsearcher.internal.service

import com.nubisoft.githubsearcher.api.dto.GithubRepositoryItemDto
import com.nubisoft.githubsearcher.api.enum.ProgrammingLanguage
import reactor.core.publisher.Mono
import java.time.LocalDate

interface SearcherAppService {
    fun getAllMarkedRepos(): Mono<List<GithubRepositoryItemDto>>

    fun markRepositoryById(githubRepositoryId: Int): Mono<GithubRepositoryItemDto>

    fun getRepositoriesByCreatedDate(createdDate: LocalDate, quantity: Int, language: ProgrammingLanguage?): Mono<List<GithubRepositoryItemDto>>
}
