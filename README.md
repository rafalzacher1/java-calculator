# java-calculator

## Description

**CS2800 Calculator** — a small **Java** library for learning stacks, infix / RPN evaluation, and **JUnit** testing. There is **no** `main` method; you verify behavior by running tests.

## Prerequisites

- **Java 11** (see `maven.compiler.source` / `target` in `pom.xml`)
- **Apache Maven** 3.x (e.g. Ubuntu/Debian: `sudo apt install maven`)

## Installation

Clone the repository, then from the project root (`java-calculator/`):

```bash
mvn compile
```

No separate dependency install step beyond Maven resolving artifacts from `pom.xml`.

## Usage

### Run tests (primary way to “run” the project)

```bash
cd java-calculator
mvn test
```

This compiles and runs all JUnit tests under `src/test/java/calculator/`. Green output means the calculator logic passed.

### Build without tests

```bash
mvn compile
mvn clean test   # clean, compile, run all tests
```

### Javadoc (optional)

Set `JAVA_HOME` to your JDK 11 install, then:

```bash
mvn javadoc:javadoc
```

Output: `target/site/apidocs/`.

## Project structure

| Path | Contents |
|------|----------|
| `src/main/java/calculator/` | API: stacks, `Entry`, `Symbol`, `Type`, `StandardCalc`, `RevPolishCalc`, exceptions |
| `src/test/java/calculator/` | JUnit 5 tests |
| `pom.xml` | Maven build |

## Stack

- **Language:** Java 11  
- **Build / test:** Maven, JUnit 5
