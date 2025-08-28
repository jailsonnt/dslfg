plugins {
    java
    kotlin("jvm") version "2.2.10"
    antlr
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.antlr:antlr4:4.1")
    implementation("commons-io:commons-io:2.20.0")
    implementation("org.apache.commons:commons-lang3:3.18.0")
    implementation(files("lib/rsyntaxtextarea-2.0.4.1.jar"))
    testImplementation("junit:junit:4.13.2")
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
    useJUnit()
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
