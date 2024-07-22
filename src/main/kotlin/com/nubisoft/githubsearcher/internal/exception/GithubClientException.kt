package com.nubisoft.githubsearcher.internal.exception

internal class GithubClientException(override val message: String, override val cause: Throwable? = null) : RuntimeException(message)
