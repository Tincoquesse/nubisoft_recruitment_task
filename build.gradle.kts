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
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("jakarta.validation:jakarta.validation-api:3.1.0")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.boot:spring-boot-testcontainers")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testImplementation("org.testcontainers:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
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

tasks.withType<Test> {
    useJUnitPlatform()
}
