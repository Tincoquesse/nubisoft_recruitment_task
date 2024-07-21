package com.nubisoft.demo.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpHeaders.CONTENT_TYPE
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class AppConfig {
    @Value("\${github-client.url}")
    lateinit var clientBaseUrl: String

    @Bean
    fun webClient(): WebClient.Builder {
        return WebClient.builder()
            .baseUrl(clientBaseUrl)
            .defaultHeader(CONTENT_TYPE, APPLICATION_JSON_VALUE)
            .codecs { configurer ->
                configurer.defaultCodecs()
                    .maxInMemorySize(16 * 1024 * 1024)
            }
    }
}
