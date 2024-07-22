package com.nubisoft.githubsearcher.internal.exception

import com.nubisoft.githubsearcher.internal.exception.model.ErrorResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.reactive.function.client.WebClientResponseException
import java.time.Instant

@ControllerAdvice
internal class ExceptionHandler {
    @ExceptionHandler(WebClientResponseException::class)
    fun handleGithubClientException(exception: WebClientResponseException): ResponseEntity<ErrorResponse> {
        val httpStatus = HttpStatus.valueOf(exception.statusCode.value())

        return ResponseEntity(toErrorResponse(exception, httpStatus), httpStatus)
    }

    private fun toErrorResponse(exception: RuntimeException, status: HttpStatus): ErrorResponse =
        ErrorResponse(
            message = exception.message ?: "No message available",
            code = status.value(),
            reason = status.reasonPhrase,
            timestamp = Instant.now()
        )
}
