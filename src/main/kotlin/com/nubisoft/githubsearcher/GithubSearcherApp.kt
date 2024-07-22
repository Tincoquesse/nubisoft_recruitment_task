package com.nubisoft.githubsearcher

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GithubSearcherApp

fun main(args: Array<String>) {
    runApplication<GithubSearcherApp>(*args)
}