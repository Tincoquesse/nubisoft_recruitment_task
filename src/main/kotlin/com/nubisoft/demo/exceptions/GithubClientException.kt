package com.nubisoft.demo.exceptions

class GithubClientException(override val message: String, override val cause: Throwable? = null) : RuntimeException(message)
