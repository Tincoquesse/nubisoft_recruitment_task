package com.nubisoft.githubsearcher.internal.exception.model

import java.time.Instant

internal data class ErrorResponse(
    val message: String,
    val code: Int,
    val reason: String,
    val timestamp: Instant,
)
