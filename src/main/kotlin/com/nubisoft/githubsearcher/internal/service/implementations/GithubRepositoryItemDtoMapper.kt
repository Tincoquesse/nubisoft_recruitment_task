package com.nubisoft.githubsearcher.internal.service.implementations

import com.nubisoft.githubsearcher.api.dto.GithubRepositoryItemDto
import models.generated.RepoSearchResultItem
import org.springframework.stereotype.Service

@Service
internal class GithubRepositoryItemDtoMapper {

    fun toDtos(repoItems: List<RepoSearchResultItem>): List<GithubRepositoryItemDto> {
        return repoItems.map { toDto(it) }
    }

    fun toDto(item: RepoSearchResultItem): GithubRepositoryItemDto {
        return GithubRepositoryItemDto(
            id = item.id.toLong(),
            stars = item.stargazersCount,
            repoName = item.name,
            repoFullName = item.fullName,
            ownerLogin = item.owner.login,
            private = item.private,
            ownerId = item.owner.id.toLong(),
            repoUrl = item.url
        )
    }
}
