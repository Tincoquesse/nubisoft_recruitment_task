package com.nubisoft.githubsearcher.api.dto

import java.net.URI

data class GithubRepositoryItemDto(
    val id: Long,
    val stars: Int,
    val repoName: String,
    val repoFullName: String,
    val ownerLogin: String,
    val private: Boolean,
    val ownerId: Long,
    val repoUrl: URI,
)
