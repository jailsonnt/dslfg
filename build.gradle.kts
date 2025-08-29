plugins {
    java
    kotlin("jvm") version "2.2.10"
    antlr
    application
    id("io.gitlab.arturbosch.detekt") version "1.23.8"
}

repositories {
    mavenCentral()
}

buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        classpath("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.23.8")
    }
}

apply(plugin = "io.gitlab.arturbosch.detekt")

dependencies {
    implementation("org.antlr:antlr4:4.1")
    implementation("commons-io:commons-io:2.20.0")
    implementation("org.apache.commons:commons-lang3:3.18.0")
    implementation(files("lib/rsyntaxtextarea-2.0.4.1.jar"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.2")
    testImplementation("org.mockito:mockito-core:5.11.0")
    testImplementation("org.mockito:mockito-junit-jupiter:5.11.0")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

application {
    mainClass.set("jailsonnt.tcc.dslfg.DSLFGGrafico")
}

tasks.test {
    useJUnitPlatform()
    failOnNoDiscoveredTests = false
}

val generatedSourcesDir = layout.buildDirectory.dir("generated-src/antlr/main").get()
val generatedTestSourcesDir = layout.buildDirectory.dir("generated-src/antlr/test").get()

tasks.generateGrammarSource {
    maxHeapSize = "64m"
    arguments = arguments + listOf(
        "-visitor",
        "-package", "jailsonnt.tcc.dslfg.antlr",
        "-lib", "src/main/antlr/jailsonnt/tcc/dslfg/antlr"
    )
    outputDirectory = file("${generatedSourcesDir}/jailsonnt/tcc/dslfg/antlr")
}

sourceSets {
    main {
        java {
            srcDirs("src/main/java", generatedSourcesDir)
        }
    }
    test {
        java {
            srcDirs("src/test/java", generatedTestSourcesDir)
        }
    }
}

tasks.named("compileTestKotlin") {
    dependsOn(tasks.named("generateTestGrammarSource"))
}

tasks.test {
    dependsOn(tasks.named("generateTestGrammarSource"))
    classpath += files(generatedTestSourcesDir)
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    compilerOptions {
        languageVersion.set(org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_2_0)
    }
}