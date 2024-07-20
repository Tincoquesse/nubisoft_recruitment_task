package com.nubisoft.demo.exceptions

import org.springframework.http.HttpStatus.BAD_REQUEST
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import java.time.Instant

@ControllerAdvice
class ExceptionHandler {
    @ExceptionHandler(GithubClientException::class)
    fun handleGithubClientException(e: RuntimeException): ResponseEntity<ErrorResponse> {
        return ResponseEntity(toErrorResponse(e), BAD_REQUEST)
    }

    private fun toErrorResponse(e: Exception): ErrorResponse =
        ErrorResponse(
            message = e.message ?: "No message available",
            code = BAD_REQUEST.value(),
            timestamp = Instant.now(),
        )
}
