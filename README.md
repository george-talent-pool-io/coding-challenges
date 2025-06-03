# Java 21 Hello World

This is a simple Hello World program demonstrating Java 21 features.

## Features Used
- Switch expressions with pattern matching and guard clauses
- (Commented example of) String templates (preview feature)

## Requirements
- Java Development Kit (JDK) 21 or higher

## How to Compile and Run

### Compile
```bash
javac src/main/java/com/example/hello/Main.java
```

### Run
```bash
java -cp src/main/java com.example.hello.Main
```

### To enable preview features (for String templates)
```bash
javac --enable-preview --release 21 src/main/java/com/example/hello/Main.java
java --enable-preview -cp src/main/java com.example.hello.Main
```

## Expected Output
```
Hello, World!
Long string: Hello Java 21
```
