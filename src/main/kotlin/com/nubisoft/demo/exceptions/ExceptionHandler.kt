package com.nubisoft.demo.exceptions

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.reactive.function.client.WebClientResponseException
import java.time.Instant

@ControllerAdvice
class ExceptionHandler {
    @ExceptionHandler(GithubClientException::class)
    fun handleGithubClientException(e: GithubClientException): ResponseEntity<ErrorResponse> {
        val statusValue = (e.cause as WebClientResponseException).statusCode.value()
        val httpStatus = HttpStatus.valueOf(statusValue)

        return ResponseEntity(toErrorResponse(e, httpStatus), httpStatus)
    }

    private fun toErrorResponse(
        e: RuntimeException,
        status: HttpStatus,
    ): ErrorResponse =
        ErrorResponse(
            message = e.message ?: "No message available",
            code = status.value(),
            timestamp = Instant.now(),
        )
}
