# java-calculator

## The CS2800 Calculator

A small Java library used as a learning exercise in software engineering tools and techniques (stacks, expression evaluation, and unit testing).

## Requirements

- **Java 11** (matches `maven.compiler.source` / `target` in `pom.xml`)
- **Apache Maven** 3.x (on Ubuntu/Debian: `sudo apt install maven`)

## How to run

This project is a **library**, not a program with a window or a `main` menu. The way you “run” it is to **execute the test suite** with Maven from the project directory (`calculator/`):

```bash
cd /path/to/calculator
mvn test
```

That compiles the code and runs every JUnit test under `src/test/java/calculator/`. Green output means the calculator logic passed the checks.

You cannot run something like `java -jar …` or `java calculator.Main` here—there is **no `main` method** in this repo. To try the API yourself you would add a small class with `public static void main` or use the tests / an IDE.

## Build (without running tests)

```bash
mvn compile    # compile only
mvn clean test # clean, then compile + run all tests
```

## Project layout

| Path | Contents |
|------|----------|
| `src/main/java/calculator/` | Calculator API: stacks (`Stack`, `NumStack`, `StrStack`, `OpStack`), `Entry`, `Symbol`, `Type`, `StandardCalc`, `RevPolishCalc`, and related exceptions |
| `src/test/java/calculator/` | JUnit 5 tests (`TestStandardCalc`, `TestRevPolishCalc`, stack tests, etc.) |

## Javadoc (optional)

Javadoc is configured to use `$JAVA_HOME/bin/javadoc`. Set `JAVA_HOME` to your JDK 11 installation, then:

```bash
mvn javadoc:javadoc
```

HTML output is generated under `target/site/apidocs/`.