# DSLFG - Domain-Specific Language for Graphs

[English](#-project-overview-english) | [Português](#-visão-geral-do-projeto-português)

## 📖 Project Overview (English)

This repository contains the reimplementation and modernization of my Bachelor's Thesis in Computer Science, originally completed in 2014, titled **"Domain-Specific Language for Graphs" (DSLFG)**.

The original academic work aimed to reduce the gap between the **theoretical foundations** and the **practical application** of graphs. It introduced a **domain-specific language** capable of describing and executing algorithms for solving graph problems.

The implementation was built with **ANTLR** for grammar definition and integrated with **Java**, supported by **JUnit** for testing. Classic graph algorithms were implemented to validate the language’s capabilities.

Today, this project is being **modernized**, transitioning from Java to Kotlin, with a focus on education and didactics. Its main goal is to serve as a **learning tool for graph theory** by providing a simplified way to describe and execute graph algorithms.

---

## ✨ Features
- Domain-Specific Language (DSL) tailored for graph algorithms.
- Based on **ANTLR 4** for parsing.
- Support for classic graph algorithms as examples.
- Includes educational resources (original thesis text and translation).
- Currently transitioning from **Java** to **Kotlin**.

---

## 📂 Documentation
The original academic material is available inside the [`doc/`](./doc/) folder:
- [check on GitHub](https://github.com/jailsonnt/dslfg/tree/master/doc)
- `original-ptbr/` → Thesis text in **Portuguese (Brazil)**. 
- `translated-en/` → AI-translated version of the text in **English**.

---

## ⚙️ Installation & Usage
This project uses **Gradle** with a wrapper included.

### Build the project:
```bash
./gradlew build
```
### Run the project:
```bash
./gradlew run
```
### Run the tests:
```bash
./gradlew test
```
## 📦 Dependencies
- implementation("org.antlr:antlr4:4.1")
- implementation("commons-io:commons-io:2.20.0")
- implementation("org.apache.commons:commons-lang3:3.18.0")
- implementation(files("lib/rsyntaxtextarea-2.0.4.1.jar"))
- testImplementation("junit:junit:4.13.2")

## 📝 License

This project is provided for educational purposes.

Forks and non-commercial publications are allowed.

Commercial use or distribution requires explicit permission from the author.

## ✍️ Author

- Jailson Nicoletti
- [LinkedIn](https://www.linkedin.com/in/your-profile)

## 📘 Language & Commands

👉 TBD. Right now check the documentation file at:  [Documentation](#-Documentation)

# DSLFG - Linguagem Específica de Domínio para Grafos

## 📖 Visão Geral do Projeto (Português)

Este repositório contém a reimplementação e modernização do meu Trabalho de Conclusão de Curso em Ciência da Computação, originalmente finalizado em 2014, intitulado **"Linguagem Específica de Domínio para Grafos" (DSLFG)**.

O trabalho acadêmico original teve como objetivo reduzir a distância entre as **bases teóricas** e a **prática** com grafos. Foi criada uma **linguagem específica de domínio** capaz de descrever e executar algoritmos que resolvem problemas utilizando essa estrutura de dados.

A implementação foi construída com **ANTLR** para definição da gramática e integrada ao **Java**, com suporte de **JUnit** para testes. Foram implementados algoritmos clássicos de grafos para validar as capacidades da linguagem.

Atualmente, este projeto está sendo **modernizado**, migrando de Java para Kotlin, com foco educacional. O objetivo principal é servir como uma **ferramenta de aprendizado em teoria dos grafos**, fornecendo uma forma simplificada de descrever e executar algoritmos.

---

## ✨ Funcionalidades
- Linguagem específica de domínio (DSL) voltada para algoritmos em grafos.
- Baseada em **ANTLR 4** para parsing.
- Exemplos de algoritmos clássicos de grafos incluídos.
- Recursos educacionais (texto do TCC original e tradução).
- Em processo de migração de **Java** para **Kotlin**.

---

## 📂 Documentação
O material acadêmico original está disponível dentro da pasta [`doc/`](./doc/):
- [check on GitHub](https://github.com/jailsonnt/dslfg/tree/master/doc)
- `original-ptbr/` → Texto da monografia em **português**.
- `translated-en/` → Versão traduzida por IA em **inglês**.

---

## ⚙️ Instalação & Uso
Este projeto utiliza **Gradle** com wrapper incluso.

Compilar o projeto:
```bash
./gradlew build
```
### Executar o projeto:
```bash
./gradlew run
```
### Rodar os testes:
```bash
./gradlew test
```

## 📦 Dependências
- implementation("org.antlr:antlr4:4.1")
- implementation("commons-io:commons-io:2.20.0")
- implementation("org.apache.commons:commons-lang3:3.18.0")
- implementation(files("lib/rsyntaxtextarea-2.0.4.1.jar"))
- testImplementation("junit:junit:4.13.2")

## 📜 Licença

Este projeto é disponibilizado para fins educacionais.

Forks e publicações não-comerciais são permitidos.

Uso ou distribuição comercial requer permissão explícita do autor.

✍️ Autor

- Jailson Nicoletti
- [LinkedIn](https://www.linkedin.com/in/your-profile)

📘 Linguagem & Comandos

👉 TBD. Por enquanto cheque a documentação original em:  [Documentação](#-Documentação)

