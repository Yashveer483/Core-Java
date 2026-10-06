# Java Variables and Data Types - Class Notes

## 00:00 — Intro
- Overview: Transitioning from foundational concepts (JDK, JRE, JVM) to Java syntax and internal memory mechanics.
- Goal: Understand how variables are declared, how data types function, what keywords and literals are, and how Java manages data internally in system memory.

## 00:30 — Variables in Java
- Purpose of Programs: Programs are written to perform calculations, print output, or execute application logic.
- Memory Allocation Need: When a program requires user input or performs operations like adding two numbers (3 + 5), the numbers must be stored in system memory (RAM) during execution.
- Variable Definition: A variable is a named container or location in system memory that holds a data value.
- Descriptive Naming Rule: Variables should be given clear, descriptive names (e.g., firstNumber, secondNumber) rather than generic names like x or y so that the intent of the variable is immediately obvious.

## 06:32 — Identifiers
- Definition: An identifier is the name given to a variable, method, or class used to identify and reference a specific memory location or container.
- Example: In int firstNumber = 4;, firstNumber is the identifier that points to the memory container holding the value 4.

## 07:57 — Black Box Model of Learning
- Concept: Learning a programming language is non-linear: certain boilerplate syntax must initially be treated as a "black box" (providing input and observing output without worrying about internal mechanics).
- Application in Java: Beginners can focus on writing code inside public static void main(String[] args) { ... }; while ignoring the class and method declarations until object-oriented programming concepts are introduced.

## 09:55 — Data Types in Java
- Definition: Data types specify what kind of value a variable can hold (e.g., whole numbers, decimal numbers, characters, booleans).
- Statically Typed Language: Java is a statically typed language, meaning the data type of every variable must be declared before compilation (DataType Identifier = Value;).
- Classification:
  1. Primitive Data Types: Basic built-in types (byte, short, int, long, float, double, char, boolean)
  2. Non-Primitive Data Types: Reference types like arrays, strings, and classes (discussed during Object-Oriented Programming)

## 13:47 — Integer DataType
- Purpose: Stores whole positive or negative numbers without decimal points.
- Four Integer Types:
  1. byte (8 bits)
  2. short (16 bits)
  3. int (32 bits)
  4. long (64 bits)
- Reason for Multiple Types: Different integer types allow developers to optimize memory depending on the range of numbers being stored.

## 16:28 — Representing Binaries
- Decimal vs. Binary:
  - Humans use the Decimal system (Base-10) using digits 0 to 9.
  - Computers store data in Binary (Base-2) using 0s (OFF) and 1s (ON).
- Bit Positions: Positions in binary represent powers of 2 (2^0, 2^1, 2^2, 2^3, ...)
  - 4_10 = 100_2
  - 10_10 = 1010_2

## 20:35 — Range of Integers
- Signed Numbers: All primitive numeric types in Java are signed (capable of representing both positive and negative values).
- Total Combinations Formula: For n bits, the total number of unique combinations is 2^n.

Data Type | Width (Bits / Bytes) | Range (Signed)
---|---|---
byte | 8 bits / 1 byte | -128 to +127
short | 16 bits / 2 bytes | -32,768 to +32,767
int | 32 bits / 4 bytes | -2,147,483,648 to +2,147,483,647
long | 64 bits / 8 bytes | -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807

## 30:37 — Floating DataType
- Purpose: Represents fractional or decimal real numbers (e.g., 5.23, 10.02)
- Two Floating-Point Types:
  1. float (32 bits / Single Precision)
  2. double (64 bits / Double Precision)

## 32:12 — Range of Real Numbers
- Precision Differences:
  - float: 32-bit single-precision floating point
  - double: 64-bit double-precision floating point
- Industry Preference: Modern processors and production systems are optimized for 64-bit double precision. Built-in Java math utilities (e.g., Math.sin()) return double values by default, making double the standard choice over float.

## 35:30 — Character DataType
- Type: char (16 bits / 2 bytes)
- Syntax: Character literals must be enclosed in single quotes (e.g., 'a', 'B')
- ASCII vs. Unicode:
  - Older languages used 8-bit ASCII (limited to 128/256 characters, primarily English)
  - Java uses 16-bit Unicode, allowing it to store characters from almost all written languages (e.g., Hindi, Tamil, Chinese, Greek)
- Internal Representation: Characters are mapped to an integer Unicode value, which is then stored as binary in memory.

## 42:19 — Boolean DataType
- Type: boolean
- Values: Can hold only two literal values: true or false
- Strict Typing: Unlike C/C++ (where 1 means true and 0 means false), Java does not allow assigning integers to booleans.

## 44:14 — Literals
- Definition: A literal is the actual fixed constant value assigned to a variable.
- Example: In int x = 12;, int is the data type, x is the identifier, and 12 is the literal.

## 45:00 — Writing Code for All Data Types (written in Code.java file)
```java
public class Demo {
    public static void main(String[] args) {
        // Integer types
        byte b = 5;
        short s = 10;
        int i = 4000;
        long l = 100000;

        // Floating-point types (float requires 'f' suffix)
        float f = 10.54f;
        double d = 23.0987;

        // Character and Boolean types
        char c = 'a';
        boolean bool = false;

        System.out.println(b + " " + s + " " + i + " " + l);
        System.out.println(f + " " + d);
        System.out.println(c);
        System.out.println(bool);
    }
}
```

## 52:02 — Alternative Ways to Declare Variables
1. Base Representations for Integers:
   - Binary Literals: Prefix with 0b or 0B (e.g., int bin = 0b101; -> 5)
   - Octal Literals: Prefix with 0 (e.g., int oct = 05; -> 5)
   - Hexadecimal Literals: Prefix with 0x or 0X (e.g., int hex = 0xA; -> 10)
2. Scientific Notation for Real Numbers:
   - double d = 6.022e23; (6.022 × 10^23)
3. Numeric Readability with Underscores:
   - Long numbers can use underscores for readability (e.g., long num = 12_34_56_789L;), which are ignored by the compiler.

## 01:00:41 — Declaration & Definition
- Declaration: Allocates memory space and informs the compiler about the variable name and type without assigning a value (e.g., int x;)
- Definition (Initialization): Assigns a specific value/literal to the declared memory container (e.g., x = 4;)
- Combined: int x = 4; declares and defines the variable in a single statement.

## 01:03:23 — Keywords
- Definition: Reserved words in Java that have special meaning to the compiler and cannot be used as identifiers for variables, classes, or methods.
- Count: Java has 68 reserved keywords (e.g., public, static, void, class, int, byte, boolean).
- Reserved Unused Keywords: goto and const are reserved by Java from C/C++ legacy but are not used in Java execution.
