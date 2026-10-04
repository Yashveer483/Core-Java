# Lesson 2: JVM, JRE, and JDK

## 00:00 — Quick Recap

### Java Execution Flow Overview

1. Source code is written in a file with the `.java` extension (e.g., `Hello.java`).
2. The Java compiler (`javac`) compiles the source code into bytecode stored in a `.class` file (e.g., `Hello.class`).
3. Bytecode is intermediate, platform-independent code.

### Platform Independence (WORA — Write Once, Run Anywhere)

- Bytecode can run on any platform (Windows, macOS, Linux), provided that the target platform has its own dedicated JVM (Java Virtual Machine).
- The JVM reads bytecode and translates it into platform-specific machine code (0s and 1s) for direct execution by the host CPU.

---

## 04:02 — Hierarchy of JVM, JRE & JDK

The relationship between Java runtime and development components is represented using a concentric circle hierarchy:

- JDK (Java Development Kit) → JRE (Java Runtime Environment) + Development Tools
- JRE (Java Runtime Environment) → JVM (Java Virtual Machine) + Core Libraries
- JVM (Java Virtual Machine) → Interpreter + JIT Compiler + Sandbox

### Components

- JVM (Inner Core): Virtual engine that executes bytecode.
- JRE (Middle Layer): Encloses JVM with built-in class libraries needed at runtime.
- JDK (Outermost Layer): Complete development kit containing JRE plus development tools like compilers and debuggers.

---

## 05:05 — JVM in Depth

### Definition of Platform

A platform is defined as the combination of:

- an Operating System (OS)
- a Processor (CPU)

For example: Windows OS + Intel x86 CPU.

### How JVM Operates

- JVM acts as a software-based virtual machine or computer running inside your physical operating system.
- It isolates the underlying host platform hardware from Java application code.

### Platform Dependency Paradox

- While Java bytecode is platform-independent, the JVM software itself is platform-dependent.
- A Windows JVM is tailored specifically for Windows system calls, while a macOS JVM is tailored for macOS.

---

## 08:15 — Compiler vs Interpreter

Both compilers and interpreters translate human-readable source code into machine-executable binary (0s and 1s), but they do so differently.

| Feature | Compiler | Interpreter |
|---|---|---|
| Execution | Translates the entire source code file at once into machine code before running | Translates and executes code line-by-line dynamically |
| Execution Speed | Fast execution once compiled, but compilation takes upfront time | Starts executing immediately, but overall runtime can be slower |
| Examples | C, C++ (compilers directly to native binary) | Python (traditionally line-by-line interpretation) |

### Java's Hybrid Approach

Java is both compiled and interpreted.

1. Source code (`.java`) is compiled by `javac` into bytecode (`.class`).
2. Bytecode (`.class`) is interpreted / JIT compiled by the JVM into native machine code.

---

## 13:24 — Role of JVM

### 1. Historical vs. Modern Execution Architecture

- 1990s Approach: Originally, JVMs used pure interpreters to launch programs quickly on constrained hardware (slow CPUs, low RAM).
- Modern Hybrid Approach (JIT + Interpreter): Modern JVMs combine a line-by-line interpreter with a Just-In-Time (JIT) compiler.

#### JIT Compiler

- Detects frequently executed code ("hotspots").
- Compiles those chunks directly into native machine code for maximum speed.

#### Interpreter

- Handles less frequently executed sections line-by-line.
- Helps avoid long initial compilation delays.

### 2. Core Responsibilities of JVM

- Bytecode Translation: Converts bytecode to native machine code via interpreter + JIT.
- Sandbox Security Model: Isolates downloaded/untrusted code inside a restricted execution space to prevent unauthorized filesystem access or harmful system calls.
- Automatic Garbage Collection: Automatically manages memory allocation and reclaims unused memory without requiring manual deallocation.

---

## 23:23 — JRE (Java Runtime Environment)

`JRE = JVM + Class Libraries`

- Class Libraries: Pre-written internal packages and methods provided by Java (e.g., `java.io` operations, console output utilities like `System.out.println`) required during execution.
- Purpose: Provides the minimum environment required to run an already compiled Java class program.
- Limitation: JRE does not contain development tools like `javac`, so you cannot compile `.java` files using JRE alone.

---

## 26:27 — JDK (Java Development Kit)

`JDK = JRE + Development Tools (javac, Debugger, JavaDocs)`

- Purpose: The complete software distribution needed to write, compile, debug, and execute Java applications.

### Practical Compilation & Execution Workflow

#### 1. Write Code

Save Java source code in a file named `Demo.java`.

```java
public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

#### 2. Compile to Bytecode

Run the compiler command in the terminal:

```bash
javac Demo.java
```

This generates `Demo.class` containing intermediate bytecode.

#### 3. Execute via JVM

Run the Java launcher:

```bash
java Demo
```

The JVM loads class libraries, translates bytecode via JIT/interpreter, and prints `Hello World` to the console.

---

## 30:09 — JSE, JME & JEE

Java offers specialized editions tailored for different application domains:

### 1. JSE (Java Standard Edition / Core Java)

- The core foundation containing language syntax, OOP concepts, data structures, and fundamental APIs.

### 2. JEE / Jakarta EE (Java Enterprise Edition)

- Extends JSE with enterprise-grade features, libraries, and specifications for building web applications, enterprise servers, and microservices (e.g., Spring Boot integration).

### 3. JME (Java Micro Edition)

- Designed as a lightweight footprint edition for early mobile devices and embedded systems.
- Status: Now largely obsolete, having been replaced by modern Android Development.

---

## Summary

- JVM is the engine that executes Java bytecode.
- JRE is required to run Java programs.
- JDK is required to develop Java programs.
- Java follows a hybrid model: compiled to bytecode, then interpreted/JIT-compiled by the JVM.
- JSE, JEE, and JME are different Java editions designed for different application types.
