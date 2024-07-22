package com.nubisoft.githubsearcher.internal.repositories

import com.nubisoft.githubsearcher.api.dto.GithubRepositoryItemDto
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
internal class GithubRepoDatabase {
    private val repos: Mono<MutableSet<GithubRepositoryItemDto>> = Mono.just(mutableSetOf())

    fun add(item: GithubRepositoryItemDto): Mono<GithubRepositoryItemDto> =
        this.repos
            .map { it.add(item) }
            .map { item }

    fun get(repoId: Int): Mono<GithubRepositoryItemDto?> =
        this.repos.mapNotNull {
            it.find { repo -> repo.id == repoId }
        }

    fun getAll(): Mono<List<GithubRepositoryItemDto>> = this.repos.map { it.toList() }
}
