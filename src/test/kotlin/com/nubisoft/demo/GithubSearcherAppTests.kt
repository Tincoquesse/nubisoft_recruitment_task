package com.nubisoft.demo

import com.github.tomakehurst.wiremock.WireMockServer
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo
import com.maciejwalkowiak.wiremock.spring.ConfigureWireMock
import com.maciejwalkowiak.wiremock.spring.EnableWireMock
import com.maciejwalkowiak.wiremock.spring.InjectWireMock
import models.generated.RepoSearchResultItem
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.reactive.server.WebTestClient

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableWireMock(ConfigureWireMock(name = "github-client", property = "github-client.url"))
class GithubSearcherAppTests {
    @Autowired
    lateinit var client: WebTestClient

    @InjectWireMock("github-client")
    lateinit var wiremock: WireMockServer

    @Test
    fun contextLoads() {
        // given
        wiremock.stubFor(
            get(urlPathEqualTo("/search/repositories"))
                .withQueryParam("q", equalTo("created:>2022-01-01"))
                .withQueryParams(
                    mapOf(
                        "sort" to equalTo("stars"),
                        "order" to equalTo("desc"),
                        "per_page" to equalTo("10"),
                    ),
                )
                .willReturn(ok()),
        )

        // when
        val response =
            client.get()
                .uri {
                    it
                        .path("/api/v1/search/repos")
                        .queryParam("createdDate", "2022-01-01")
                        .queryParam("quantity", 10)
                        .build()
                }
                .exchange()
                .expectStatus().isOk
                .expectBodyList(RepoSearchResultItem::class.java)
                .returnResult()

        // then
        assertThat(response.responseBody).hasSize(0)
        wiremock.verify(getRequestedFor(urlPathEqualTo("/search/repositories")))
    }
}
