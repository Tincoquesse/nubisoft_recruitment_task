package com.nubisoft.githubsearcher

import com.github.tomakehurst.wiremock.WireMockServer
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.okJson
import com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo
import com.maciejwalkowiak.wiremock.spring.ConfigureWireMock
import com.maciejwalkowiak.wiremock.spring.EnableWireMock
import com.maciejwalkowiak.wiremock.spring.InjectWireMock
import com.nubisoft.githubsearcher.api.enum.ProgrammingLanguage.JAVA
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
    fun `Should get list of Github best starred repositories with all filters on`() {
        // given
        val wiremockResponse = String(javaClass.getResourceAsStream("/fixtures/GetRepositoriesGithubSearchResponse.json")!!.readAllBytes())

        wiremock.stubFor(
            get(urlPathEqualTo("/search/repositories"))
                .withQueryParam("q", equalTo("created:>2022-01-01, language:Java"))
                .withQueryParams(
                    mapOf(
                        "sort" to equalTo("stars"),
                        "order" to equalTo("desc"),
                        "per_page" to equalTo("5")
                    )
                )
                .willReturn(okJson(wiremockResponse))
        )

        // when
        val response =
            client.get()
                .uri { builder ->
                    builder
                        .path("/api/v1/repos/search")
                        .queryParam("createdDate", "2022-01-01")
                        .queryParam("quantity", 5)
                        .queryParam("language", JAVA)
                        .build()
                }
                .exchange()
                .expectStatus().isOk
                .expectBodyList(RepoSearchResultItem::class.java)
                .returnResult()

        // then
        assertThat(response.responseBody).hasSize(5)
        wiremock.verify(getRequestedFor(urlPathEqualTo("/search/repositories")))
    }
}
