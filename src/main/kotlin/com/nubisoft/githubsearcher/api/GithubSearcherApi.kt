package com.nubisoft.githubsearcher.api

import com.nubisoft.githubsearcher.api.dto.GithubRepositoryItemDto
import com.nubisoft.githubsearcher.api.enum.ProgrammingLanguage
import com.nubisoft.githubsearcher.internal.exceptions.ErrorResponse
import com.nubisoft.githubsearcher.internal.services.GithubService
import com.nubisoft.githubsearcher.internal.services.SearcherAppService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import models.generated.RepoSearchResultItem
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.time.LocalDate

@RestController
@RequestMapping("/api/v1", produces = [APPLICATION_JSON_VALUE])
class GithubSearcherApi(
    private val githubService: GithubService,
    private val searcherService: SearcherAppService,
) {
    @ApiResponses(
        value = [
            ApiResponse(
                responseCode = "200",
                content = [Content(mediaType = "application/json", schema = Schema(implementation = RepoSearchResultItem::class)) ]
            ),
            ApiResponse(
                responseCode = "400",
                content = [Content(schema = Schema(implementation = ErrorResponse::class)) ]
            )
        ]
    )
    @Operation(summary = "Get all best starred Github repositories")
    @GetMapping("/repos/search")
    fun getSortedGithubRepositories(
        @RequestParam createdDate: LocalDate,
        @RequestParam quantity: Int,
        @RequestParam language: ProgrammingLanguage?,
    ): Mono<List<GithubRepositoryItemDto>> {
        return githubService.getRepositoriesByCreatedDate(createdDate, quantity, language)
    }

    @Operation(summary = "Get all marked Github repositories")
    @GetMapping("/repos/marked")
    fun getAllMarkedRepositories(): Mono<List<GithubRepositoryItemDto>> {
        return searcherService.getAllMarkedRepos()
    }

    @Operation(summary = "Get all marked Github repositories")
    @PostMapping("/repos/{repoId}/mark")
    fun markRepositoryById(
        @PathVariable repoId: Int,
    ): Mono<GithubRepositoryItemDto> {
        return searcherService.markRepositoryById(repoId)
    }
}
