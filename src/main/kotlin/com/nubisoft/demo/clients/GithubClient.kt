package com.nubisoft.demo.clients

import com.nubisoft.demo.exceptions.GithubClientException
import models.generated.RepoSearchResult
import models.generated.RepoSearchResultItem
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Flux
import java.time.LocalDate

@Service
class GithubClient(
    private val webClientBuilder: WebClient.Builder,
) {
    fun getRepositoriesByCreatedDate(
        date: LocalDate,
        quantity: Int,
    ): Flux<List<RepoSearchResultItem>> {
        return webClientBuilder.build()
            .get()
            .uri {
                it.path("search/repositories")
                    .queryParam("q", "created:>$date")
                    .queryParam("sort", "stars")
                    .queryParam("order", "desc")
                    .queryParam("per_page", quantity)
                    .build()
            }
            .retrieve()
            .bodyToFlux(RepoSearchResult::class.java)
            .mapNotNull { it.items }
            .onErrorMap { GithubClientException(it.message ?: "Unknown error") }
    }
}
