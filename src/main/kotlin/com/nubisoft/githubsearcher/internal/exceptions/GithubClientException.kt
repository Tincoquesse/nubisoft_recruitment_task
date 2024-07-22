package com.nubisoft.githubsearcher.internal.exceptions

internal class GithubClientException(override val message: String, override val cause: Throwable? = null) : RuntimeException(message)
