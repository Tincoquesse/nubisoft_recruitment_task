package com.nubisoft.demo.api

import com.nubisoft.demo.clients.GithubClient
import models.generated.RepoSearchResultItem
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import java.time.LocalDate

@RestController
@RequestMapping("/api/v1")
class AppController(
    private val githubClient: GithubClient,
) {
    @GetMapping("/repositories")
    fun getSortedGithubRepositories(
        @RequestParam created: LocalDate,
        @RequestParam quantity: Int,
    ): Flux<List<RepoSearchResultItem>> {
        return githubClient.getRepositoriesByCreatedDate(created, quantity)
    }
}
