package com.nubisoft.githubsearcher.api.dto

import java.net.URI

data class GithubRepositoryItemDto(
    val id: Int,
    val stars: Int,
    val name: String,
    val fullName: String,
    val ownerLogin: String,
    val private: Boolean,
    val ownerId: Int,
    val repoUrl: URI,
)
