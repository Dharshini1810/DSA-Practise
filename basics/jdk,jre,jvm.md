# JDK vs JRE vs JVM

## 1️⃣ Java Development Kit (JDK)
The JDK is a complete set of tools required for Java development. It is the largest and includes everything needed for writing, compiling, and running Java programs.

### Functionalities:
Compiler (javac): Converts Java source code into bytecode (.class files).
Java Runtime Environment (JRE): Provides everything to run Java applications (JVM + libraries).
Development Tools: Includes tools like:
Debugger (jdb)
Documentation Generator (javadoc)
Profiler (jconsole)
JAR Utilities (jar) for packaging applications.
Standard Libraries: Includes Java API libraries such as java.util, java.lang, etc.

### Size:
Largest among the Java components. The JDK typically weighs 1-2 GB, depending on the version.

## 2️⃣ Java Runtime Environment (JRE)
The JRE is a subset of the JDK. It provides everything required to run Java applications, but not to develop them.

### Functionalities:
JVM (Java Virtual Machine): Executes the Java bytecode.
Java Libraries: Provides Java API (for example, classes like java.lang, java.io, etc.) to interact with the operating system, handle I/O, perform networking, etc.
Class Loader: Loads Java classes from the disk into memory for execution.

### Size:
Smaller than JDK but larger than JVM, usually 100 MB - 300 MB.

## 3️⃣ Java Virtual Machine (JVM)
The JVM is an abstract computing machine that provides an environment for running Java bytecode. It is responsible for interpreting the bytecode and running it on different platforms.

### Functionalities:
Memory Management: Manages Heap and Stack memory for Java objects and method calls.
Garbage Collection (GC): Automatically handles memory cleanup by reclaiming unused objects from the heap.
Execution Engine: Executes bytecode instructions.
JIT Compiler: Improves performance by compiling frequently used bytecode into native machine code during runtime.

### Size:
Small compared to JDK and JRE, typically 50 MB - 100 MB.

## 4️⃣ What is a Linker & Loader?

### Linker
Combines multiple compiled files (.class) into a single unit.
Resolves dependencies between different Java classes.
Example: If A.class calls B.class, the linker ensures B.class is available.

### Loader
Loads .class files into JVM memory for execution.
Uses Class Loader Subsystem to organize and verify bytecode.
Example: ClassLoader loads MyProgram.class when you run java MyProgram.
Size: Linker & Loader are part of JVM, so they are small.

### Comparison of Sizes and Functions
<img width="372" alt="image" src="https://github.com/user-attachments/assets/34eafd9a-6909-4365-898d-6b847afbe28b" />


### How They Interact:
JDK: The development environment that allows you to write, compile, and debug Java programs.
JRE: The runtime environment that allows you to run Java programs.
JVM: The core execution engine within the JRE that runs the bytecode.
Linker: Resolves object files into an executable in traditional compiled languages (not used directly in Java, which relies on dynamic linking via JVM).
Loader: Loads classes into memory at runtime in the JVM, managed by the Class Loader.
