# Class Notes

## 00:00 – Introduction to the Course

- Overview: Launch of the Core Java series designed to cover Java from absolute fundamentals to advanced concepts.
- Two Core Warnings:
  1. Deep Architectural Understanding: The course will not focus solely on basic syntax (which AI tools like ChatGPT or Claude can easily generate).
     - Instead, it covers internal architecture, computer science fundamentals, and first-principles thinking.
  2. Active Learning Required: Students must participate actively by watching daily, executing code, implementing theory, and solving practice problems rather than passively watching.

## 02:37 – Era before Java

- Dominant Languages (1980s–1990s): Programming was dominated by C and C++.
- Characteristics of C/C++:
  - Highly popular due to their execution speed compared to earlier languages.
  - Considered low-level languages because they operated close to the hardware with minimal abstraction layers.
  - Used English-like syntax, improving upon Assembly language (which had limited commands like MOV or COPY and raw binary machine code).

## 05:26 – Why Java

- The Core Problem: Despite the popularity of C/C++, they suffered from a severe lack of portability.
- How C/C++ Execution Worked:
  - Source code (e.g., hello.cpp) was passed to a compiler (a software tool) to generate machine code (binary 0s and 1s).
  - Machine code compiled for one specific system or platform would fail to run on a different platform without being recompiled.
  - Consequently, C and C++ were strictly platform-dependent.

## 09:55 – Platforms

- Definition of a Platform: A platform is defined as the combination of:
  - Platform = Processor (Hardware) + Operating System (OS)
- Example 1 (P1): Intel X86 Processor + Windows OS.
- Example 2 (P2): ARM Processor + macOS.
- Why OS Differences Cause Different Binaries:
  - Common program instructions (such as printing output to the console, reading/writing files, or allocating memory) require communication with the operating system.
  - When compiling C/C++, the compiler embeds OS-specific system libraries into the binary.
  - Because Windows system calls differ from macOS system calls, compiling the exact same source code produces different binary outputs for each OS.

## 23:25 – ISA on Platforms

- Why Processor Differences Cause Different Binaries:
  - Processors contain billions/trillions of physical transistors operating via binary states (Current ON = 1, OFF = 0).
  - Physical hardware layout and pin interactions vary significantly across processor families (e.g., Intel X86 vs ARM).
- Instruction Set Architecture (ISA):
  - Serves as the intermediate “grammar” or command set between a program and a CPU, defining how basic low-level instructions (such as ADD, LOAD, STORE, JUMP) are executed.
  - Because different processors utilize distinct ISAs, machine code compiled for one processor's ISA cannot be understood by another processor.

## 26:14 – Problems with C/C++

1. Platform Dependence / Lack of Portability: Code had to be manually recompiled for every distinct target platform.
2. Complexity: C/C++ contained complex and error-prone features such as pointers, multiple inheritance, and manual memory management (deallocation).
3. Security Vulnerabilities: Direct access to hardware and memory without an isolated runtime environment made C/C++ less secure.

## 28:07 – Solutions by Java

- Java was designed specifically to address the major shortcomings of C/C++:
  1. Portable (Platform Independent): Code is compiled once and can run anywhere.
  2. Simple: Complex C/C++ constructs were eliminated or automated.
  3. Secure: Programs execute within a protected runtime environment.

## 29:52 – ByteCode & JVM

- Analogy: C/C++ requires you to learn the local language of every country you visit (Mandarin in China, Spanish in Spain). Java provides a personal translator (JVM) who speaks both your language and the local language.
- How Java Works:
  1. Java source code (`.java` file) is compiled by the Java Compiler into an intermediate format called ByteCode (`.class` file).
  2. ByteCode is not machine code; it is a uniform intermediate representation identical across all systems.
  3. The Java Virtual Machine (JVM) (a software translator installed on the target platform) reads the ByteCode line-by-line and translates it into that specific platform's native machine code.
- Crucial Distinction: While Java ByteCode is platform-independent, the JVM itself is platform-dependent (a Windows JVM is tailored for Windows, a Mac JVM for macOS).
- WORA Concept: Enables “Write Once, Run Anywhere”.
- Historical Driver: Essential for the 1990s growth of heterogeneous environments, embedded systems (set-top boxes, smart TVs), and web servers.

## 40:56 – Features of Java

The three pillars that drove Java's rapid worldwide adoption:

1. Portability (Platform Independence / WORA)
2. Simplicity
3. Security

## 45:40 – Java is Simple

- Removed Pointers: Prevents direct, risky memory manipulation.
- Removed Multiple Inheritance: Eliminates diamond-problem ambiguities.
- Automated Memory Management: Eliminates manual memory deallocation through internal garbage collection mechanisms.

## 47:24 – Java is Secure

- Context: Java was deployed on backends (Java Servlets) and client-side frontends via Java Applets (lightweight programs downloaded over links to run inside web browsers prior to JavaScript's dominance).
- Fun Fact: JavaScript was named after Java primarily to leverage Java's popularity at the time.
- Security Threat: Running untrusted code downloaded over the internet inside a user's browser posed risks of data theft or system crashes.
- JVM Sandbox Model:
  - To solve this, the JVM executes ByteCode inside an isolated, restricted environment known as the Sandbox Model.
  - The sandbox restricts unauthorized access to filesystem resources or sensitive hardware unless explicitly permitted.
  - (Note: Applets were later deprecated around JDK 10/11 as modern web standards evolved.)

## 55:08 – Can C/C++ be Platform Independent?

- Theoretically Yes: C/C++ could technically be compiled to an intermediate bytecode executed by a virtual machine.
- Why it wasn't done for C/C++: C/C++ was intentionally preserved as a low-level, high-performance language operating directly on hardware without virtual machine overhead.
- Industry Adaptation: Microsoft implemented this virtual-machine architecture to create C# as a platform-independent successor to C++ and competitor to Java.
- Modern languages like Python and C# continue Java's legacy of virtual-machine-based platform independence.
