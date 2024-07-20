package com.nubisoft.demo.exceptions

import java.time.Instant

data class ErrorResponse(
    val message: String,
    val code: Int,
    val timestamp: Instant,
)
