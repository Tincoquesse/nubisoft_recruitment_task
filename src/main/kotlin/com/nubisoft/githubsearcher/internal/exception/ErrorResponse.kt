package com.nubisoft.githubsearcher.internal.exception

import java.time.Instant

internal data class ErrorResponse(
    val message: String,
    val code: Int,
    val timestamp: Instant,
)
