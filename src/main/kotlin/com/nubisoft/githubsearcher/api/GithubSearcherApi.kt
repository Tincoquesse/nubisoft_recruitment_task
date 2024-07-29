package com.nubisoft.githubsearcher.api

import com.nubisoft.githubsearcher.api.dto.GithubRepositoryItemDto
import com.nubisoft.githubsearcher.api.enum.ProgrammingLanguage
import com.nubisoft.githubsearcher.internal.service.SearcherAppService
import io.swagger.v3.oas.annotations.Operation
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
    private val searcherService: SearcherAppService,
) {
    @Operation(summary = "Get all best starred Github repositories")
    @GetMapping("/repos/search")
    fun getSortedGithubRepositories(
        @RequestParam createdDate: LocalDate,
        @RequestParam quantity: Int,
        @RequestParam language: ProgrammingLanguage?,
    ): Mono<List<GithubRepositoryItemDto>> {
        return searcherService.getRepositoriesByCreatedDate(createdDate, quantity, language)
    }

    @Operation(summary = "Get all marked Github repositories")
    @GetMapping("/repos/marked")
    fun getAllMarkedRepositories(): Mono<List<GithubRepositoryItemDto>> {
        return searcherService.getAllMarkedRepos()
    }

    @Operation(summary = "Mark Github repository with given id")
    @PostMapping("/repos/{repoId}/mark")
    fun markRepositoryById(
        @PathVariable repoId: Long,
    ): Mono<GithubRepositoryItemDto> {
        return searcherService.markRepositoryById(repoId)
    }
}
