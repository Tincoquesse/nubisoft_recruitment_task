package com.nubisoft.githubsearcher.internal.exception.model

internal class GithubClientException(override val message: String, override val cause: Throwable? = null) : RuntimeException(message)
