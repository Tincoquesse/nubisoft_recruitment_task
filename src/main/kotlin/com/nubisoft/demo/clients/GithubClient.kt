package com.nubisoft.demo.clients

import com.nubisoft.demo.enums.ProgrammingLanguage
import com.nubisoft.demo.exceptions.GithubClientException
import models.generated.RepoSearchResult
import models.generated.RepoSearchResultItem
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono
import java.time.LocalDate

@Service
class GithubClient(
    private val webClientBuilder: WebClient.Builder,
) {
    private companion object {
        const val Q = "q"
        const val SORT = "sort"
        const val ORDER = "order"
        const val PER_PAGE = "per_page"
    }

    fun getRepositoriesByCreatedDate(
        date: LocalDate,
        quantity: Int,
        language: ProgrammingLanguage?,
    ): Mono<List<RepoSearchResultItem>> {
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
            .onErrorMap { GithubClientException(it.message ?: "Unknown error", cause = it) }
    }
}
