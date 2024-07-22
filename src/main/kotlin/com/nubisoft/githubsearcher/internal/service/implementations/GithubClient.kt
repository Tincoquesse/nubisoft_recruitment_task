package com.nubisoft.githubsearcher.internal.service.implementations

import com.nubisoft.githubsearcher.api.enum.ProgrammingLanguage
import models.generated.RepoSearchResult
import models.generated.RepoSearchResultItem
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono
import java.time.LocalDate

@Service
internal class GithubClient(
    private val webClientBuilder: WebClient.Builder,
) {
    private companion object {
        const val Q = "q"
        const val SORT = "sort"
        const val ORDER = "order"
        const val PER_PAGE = "per_page"
    }

    fun getRepositoriesByCreatedDate(date: LocalDate, quantity: Int, language: ProgrammingLanguage?): Mono<List<RepoSearchResultItem>> {
        return webClientBuilder.build()
            .get()
            .uri { builder ->
                builder
                    .path("search/repositories")
                    .queryParam(Q, ("created:>$date" + (language?.let { ", language:${it.value}" } ?: "")))
                    .queryParam(SORT, "stars")
                    .queryParam(ORDER, "desc")
                    .queryParam(PER_PAGE, quantity)
                    .build()
            }
            .retrieve()
            .bodyToMono(RepoSearchResult::class.java)
            .mapNotNull { it.items }
    }

    fun getRepositoryById(repoId: Long): Mono<RepoSearchResultItem> {
        return webClientBuilder.build()
            .get()
            .uri("repositories/$repoId")
            .retrieve()
            .bodyToMono(RepoSearchResultItem::class.java)
    }
}
