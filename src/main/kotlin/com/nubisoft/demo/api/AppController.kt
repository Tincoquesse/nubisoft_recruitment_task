package com.nubisoft.demo.api

import com.nubisoft.demo.clients.GithubClient
import com.nubisoft.demo.enums.ProgrammingLanguage
import io.swagger.v3.oas.annotations.Operation
import models.generated.RepoSearchResultItem
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
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
    @GetMapping("/repositories", produces = [APPLICATION_JSON_VALUE])
    @Operation(
        summary = "Get all best starred Github repositories",
        description =
            """ 
                Get A list of the most popular repositories, sorted by number of stars.
                Can be filtered by language and created date.
            """,
    )
    fun getSortedGithubRepositories(
        @RequestParam createdDate: LocalDate,
        @RequestParam quantity: Int,
        @RequestParam language: ProgrammingLanguage?,
    ): Flux<List<RepoSearchResultItem>> {
        return githubClient.getRepositoriesByCreatedDate(createdDate, quantity, language)
    }
}
