plugins {
    id("java")
    id("org.springframework.boot") version "3.3.2"
    id("io.spring.dependency-management") version "1.1.6"
    id("org.jsonschema2pojo") version "1.2.1"
    id("org.jlleitschuh.gradle.ktlint") version "12.1.1"
    kotlin("jvm") version "1.9.24"
    kotlin("plugin.spring") version "1.9.24"
}

group = "com.nubisoft"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator:3.3.2")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springdoc:springdoc-openapi-starter-webflux-ui:2.6.0")
    implementation("org.springdoc:springdoc-openapi-starter-common:2.6.0")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("jakarta.validation:jakarta.validation-api:3.1.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("com.maciejwalkowiak.spring:wiremock-spring-boot:2.1.2")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

jsonSchema2Pojo {
    sourceFiles = files("src/main/resources/schema")
    isIncludeGeneratedAnnotation = true
    includeJsr303Annotations = true
    useJakartaValidation = true
    generateBuilders = true
    targetDirectory = file("src/main/java/")
    targetPackage = "models.generated"
    useInnerClassBuilders = true
    dateTimeType = "java.time.ZonedDateTime"
    useBigDecimals = true
    useTitleAsClassname = true
    includeConstructors = true
}

tasks.named("compileKotlin").configure {
    dependsOn("generateJsonSchema2Pojo")
}

tasks.named("runKtlintCheckOverMainSourceSet").configure {
    dependsOn("generateJsonSchema2Pojo")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
