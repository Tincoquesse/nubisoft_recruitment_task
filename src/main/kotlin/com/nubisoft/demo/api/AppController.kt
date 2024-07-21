package com.nubisoft.demo.api

import com.nubisoft.demo.clients.GithubClient
import com.nubisoft.demo.enums.ProgrammingLanguage
import com.nubisoft.demo.exceptions.ErrorResponse
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import models.generated.RepoSearchResultItem
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.time.LocalDate

@RestController
@RequestMapping("/api/v1")
class AppController(
    private val githubClient: GithubClient,
) {
    @Operation(summary = "Get all best starred Github repositories")
    @ApiResponses(
        value = [
            ApiResponse(
                responseCode = "200",
                content = [Content(mediaType = "application/json", schema = Schema(implementation = RepoSearchResultItem::class)) ],
            ),
            ApiResponse(
                responseCode = "400",
                content = [Content(schema = Schema(implementation = ErrorResponse::class)) ],
            ),
            ApiResponse(
                responseCode = "404",
                content = [Content(schema = Schema(implementation = ErrorResponse::class)) ],
            ),
        ],
    )
    @GetMapping("/search/repos", produces = [APPLICATION_JSON_VALUE])
    fun getSortedGithubRepositories(
        @RequestParam createdDate: LocalDate,
        @RequestParam quantity: Int,
        @RequestParam language: ProgrammingLanguage?,
    ): Mono<List<RepoSearchResultItem>> {
        return githubClient.getRepositoriesByCreatedDate(createdDate, quantity, language)
    }
}
