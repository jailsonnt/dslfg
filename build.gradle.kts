plugins {
    java
    kotlin("jvm") version "2.2.10"
    antlr
    application
    id("io.gitlab.arturbosch.detekt") version "1.23.8"
}

repositories {
    mavenCentral()
    maven { url = uri("https://repo.clojars.org/") }
}

dependencies {
    implementation("commons-io:commons-io:2.20.0")
    implementation("org.apache.commons:commons-lang3:3.18.0")
    implementation("org.fife.ui:rsyntaxtextarea:2.0.4.1")

    testImplementation(platform("org.junit:junit-bom:5.13.4"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testImplementation("org.mockito:mockito-core:5.11.0")
    testImplementation("org.mockito:mockito-junit-jupiter:5.11.0")

    detekt("io.gitlab.arturbosch.detekt:detekt-cli:1.23.8")
    detekt("io.gitlab.arturbosch.detekt:detekt-formatting:1.23.8")

    antlr("org.antlr:antlr4:4.1")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

application {
    mainClass.set("jailsonnt.tcc.dslfg.DSLFGGrafico")
}

detekt {
    autoCorrect = true
}

tasks.test {
    useJUnitPlatform()
}

tasks.generateGrammarSource {
    arguments = arguments + listOf(
        "-package", "jailsonnt.tcc.dslfg.interpretacao.gramatica",
        "-lib", "src/main/antlr/jailsonnt/tcc/dslfg/interpretacao/gramatica",
    )
}

tasks.compileKotlin {
    dependsOn(tasks.generateGrammarSource)
}

tasks.compileTestKotlin {
    dependsOn(tasks.generateTestGrammarSource)
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    compilerOptions {
        languageVersion.set(org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_2_0)
    }
}