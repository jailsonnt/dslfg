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

/*
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
    java
    kotlin("jvm") version "2.2.10"
    antlr
    application
}

group = "jailsonnt.tcc.dslfg"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

val generatedSourcesDir = layout.buildDirectory.dir("generated-src/antlr/main").get()

configurations {
    // Configuração para incluir as dependências de teste no classpath de compilação
    compileClasspath {
        extendsFrom(configurations.testImplementation.get())
    }
}

dependencies {
    // Kotlin standard library
    implementation(kotlin("stdlib"))

    // ANTLR 4.1
    antlr("org.antlr:antlr4:4.1")
    implementation("org.antlr:antlr4-runtime:4.1")

    // Apache Commons IO
    implementation("commons-io:commons-io:2.20.0")

    // Apache Commons Lang3
    implementation("org.apache.commons:commons-lang3:3.18.0")

    // RSyntaxTextArea
    implementation("com.fifesoft:rsyntaxtextarea:2.0.4.1")

    // Dependências de teste
    testImplementation("junit:junit:4.13.2") {
        exclude(group = "org.hamcrest")
    }
    testImplementation("org.hamcrest:hamcrest:2.2")
}

// Configuração do ANTLR
tasks.generateGrammarSource {
    maxHeapSize = "64m"
    arguments = arguments + listOf(
        "-visitor",
        "-package", "jailsonnt.tcc.dslfg.antlr",
        "-lib", "src/main/antlr/jailsonnt/tcc/dslfg/antlr"
    )
    outputDirectory = file("${generatedSourcesDir}/jailsonnt/tcc/dslfg/antlr")
}
tasks.named("compileTestKotlin") {
    dependsOn(tasks.named("generateTestGrammarSource"))
}

// Configuração de compilação do Kotlin
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    dependsOn(tasks.generateGrammarSource)
    compilerOptions {
        jvmTarget = JvmTarget.JVM_21
        languageVersion = KotlinVersion.KOTLIN_2_2
        apiVersion = KotlinVersion.KOTLIN_2_2
        freeCompilerArgs.add("-Xjvm-default=all")
    }
}

// Configuração para incluir os arquivos gerados pelo ANTLR no classpath
sourceSets {
    main {
        java {
            srcDirs("src/main/java", generatedSourcesDir)
        }
        resources {
            srcDirs("src/main/resources")
        }
    }

    test {
        java {
            srcDirs("src/test/java")
        }
        resources {
            srcDirs("src/test/resources")
        }
    }
}

// Configuração dos testes
tasks.test {
    useJUnit() // Usando JUnit 4 diretamente
    testLogging {
        events("passed", "skipped", "failed")
        showStandardStreams = true
    }

    // Garante que os testes vejam as classes geradas
    dependsOn(tasks.generateGrammarSource)

    // Configura o classpath para incluir o diretório de saída do ANTLR
    classpath += files(generatedSourcesDir)
}

val generatedTestSourcesDir = layout.buildDirectory.dir("generated-src/antlr/test").get()

// Configure the ANTLR task for test grammar generation
tasks.register<org.antlr.v4.Tool>("generateTestGrammarSource") {
    maxHeapSize = "64m"
    arguments = arguments + listOf(
        "-visitor",
        "-package", "jailsonnt.tcc.dslfg.antlr",
        "-lib", "src/test/antlr/jailsonnt/tcc/dslfg/antlr"
    )
    outputDirectory = file("${generatedTestSourcesDir}/jailsonnt/tcc/dslfg/antlr")
}

// Include the generated test sources in the test source set
sourceSets {
    test {
        java {
            srcDirs("src/test/java", generatedTestSourcesDir)
        }
        resources {
            srcDirs("src/test/resources")
        }
    }
}

// Ensure the test compilation depends on the test grammar generation
tasks.named("compileTestKotlin") {
    dependsOn(tasks.named("generateTestGrammarSource"))
}

// Ensure tests see the generated classes
tasks.test {
    dependsOn(tasks.named("generateTestGrammarSource"))
    classpath += files(generatedTestSourcesDir)
}

// Configuração da aplicação
application {
    mainClass.set("jailsonnt.tcc.dslfg.interfaceDoUsuario.AmbienteDeExecucaoDSLFG")
}

// Configuração do JAR
tasks.jar {
    manifest {
        attributes["Main-Class"] = "jailsonnt.tcc.dslfg.interfaceDoUsuario.AmbienteDeExecucaoDSLFG"
    }
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) }) {
        exclude("META-INF/*.RSA", "META-INF/*.SF", "META-INF/*.DSA")
    }
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

// Configuração de limpeza
tasks.clean {
    delete(generatedSourcesDir)
}

// Garante que os testes sejam executados após a compilação
tasks.check {
    dependsOn(tasks.test)
}**/
