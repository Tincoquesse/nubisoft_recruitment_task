package com.nubisoft.githubsearcher.internal.service

import com.nubisoft.githubsearcher.api.dto.GithubRepositoryItemDto
import com.nubisoft.githubsearcher.api.enum.ProgrammingLanguage
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono
import java.time.LocalDate

@Repository
interface GithubService {
    fun getRepositoryById(repositoryId: Int): Mono<GithubRepositoryItemDto>

    fun getRepositoriesByCreatedDate(createdDate: LocalDate, quantity: Int, language: ProgrammingLanguage?): Mono<List<GithubRepositoryItemDto>>
}
