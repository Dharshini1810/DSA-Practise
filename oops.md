# OOPS concept

## Methods
A method is a block of code designed to perform a specific task. The primary purpose of using methods is code reusability, allowing developers to write code once and reuse it whenever needed.

In many programming languages, such as C or Python, these are commonly referred to as functions. However, in Java, they are called methods because all functions must be defined inside a class. In contrast, languages like C or Python allow functions to be defined outside of a class or object.

A typical Java method includes the following components:

- Method name: The name used to identify and call the method.
- Return type: Specifies what type of value the method returns (e.g., int, String, void if it returns nothing).
- Parameters (optional): A list of input values the method accepts to perform its task.

### Method Definition: 
This refers to creating or writing a method. It includes specifying the method name, return type, parameters (if any), and the block of code (body) that defines what the method does.

### Method Call: 
This is the process of invoking or executing a defined method. When a method is called, the program control transfers to that method’s code, executes it, and returns the result (if any).

### Types of method:

#### Void method:
- These methods do not return any value.
- The return type is specified as void.
- Used when you want the method to perform an action but not return anything.

#### Non-void method:
- These methods return a value, such as int, String, boolean, etc.
- The return type must be specified during method definition.
- The method must use the return keyword to return a value.

#### Parameterized method:
- These methods accept parameters (arguments) when called.
- Parameters are defined in the method signature and used inside the method body.

#### Non-parameterized method:
- These methods do not accept any parameters.
- Useful when the method doesn’t need external data to perform its operation.

# Class and Object

- Classes are blueprint/template/desgin for creating objects. So basically class tells how an object should be created.

- It defines what an object will have (properties) and what it can do (methods). Properties are variables that are used to store data and methods are functions that can perform

- Class doesn't hold any memory while execution

📦 Example:
Imagine a class is a blueprint of a Car.
It defines that every car has:
color
speed

and actions like:
drive
stop

```
class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Car is driving");
    }

    void stop() {
        System.out.println("Car has stopped");
    }
}

```

🚗 Object (real thing created from class)
An object is a real version of the class.
You use the class blueprint to create objects.

```
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // This is an object
        myCar.color = "Red";
        myCar.speed = 100;

        myCar.drive(); // Output: Car is driving
    }
}
```

Class = blueprint
Object = real thing made from that blueprint

# Java Memory Allocation - Stack and Heap memory

The Java Virtual Machine (JVM) is responsible for managing memory.
Here's what JVM does:
🔹 1. Allocates memory automatically:
When you declare a variable or create an object, JVM decides whether to put it in the stack or the heap.

Primitive types and method calls → go into the stack.

Objects (created with new) → go into the heap.

🔹 2. Manages memory lifecycle:
JVM keeps track of memory used and frees it when not needed.

🔹 3. Runs the Garbage Collector (GC):
Garbage Collector is a background process.

It cleans up memory in the heap when no object is being used anymore (i.e., no references to it).

There are two memory allocation in java: Stack and Heap memory

Stack: LIFO
Stores: Primitive types, [int, float etc]
        method calls, [main(), add() etc]
        reference variables

```
class Car{
    int speed = 100;
    String color = "Red";
    public void drive(){
        int i = 10;
        System.out.println("Car is driving");
    }
}
class Main {
    public static void main(String[] args) {
        int model_no = 123; // Primitive type, goes into the stack
        Car myCar = new Car(); // This is an object
        myCar.color = "Blue";
        myCar.speed = 100;
        myCar.drive(); // Output: Car is driving
    }
}
```

In above code: 

In stack memory: 

main() --> will be first pushed
model_no = 123 --> model_no variable of type int will be created and 123 is stored inside it
myCar = 201 --> reference variable of type Car will be created and it will store the address of actual object created 
in memory
myCar1 = 202
drive() --> Car's drive() method will be pushed into the stack memory

In heap memory: It is a large volume of dynamic memory which is used to store the objects of the class.

myCar object --> In the myCar object, speed, color and drive() method will be stored in the heap memory.
imagine myCar object is another stack frame which is created in the heap memory.

myCar --> speed  [Address: 201]
          color
          drive() method [which is actually a reference to method in stack memory]

If I created myCar1

myCar1 --> speed  [Address: 202]
          color
          drive() method [which is actually a reference to method in stack memory]

myCar and myCar1 are two different objects in heap, changing speed or color in one object doesn't affect another
as these are two different object

✅ Java Memory Allocation with Scanner – Summary
| Memory Type | What it stores                                                |
| ----------- | ------------------------------------------------------------- |
| **Stack**   | - Method calls<br>- Local variables (primitives + references) |
| **Heap**    | - Objects (e.g., `Scanner`, `String`)                         |

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Step 1
        int age = sc.nextInt();               // Step 2
        String name = sc.nextLine();          // Step 3
    }
}
```

✅ Step 1: Create Scanner object
```
Scanner sc = new Scanner(System.in);
```
new Scanner() → creates a Scanner object in heap
sc is a reference stored in stack

```
Stack:                            Heap:
|------------------------|        |--------------------------|
|  sc  → 📍              |  --->  | Scanner object           |
|------------------------|        |--------------------------|
```

✅ Step 2: Read int input
```
int age = sc.nextInt();  // user enters: 25
```

nextInt() reads input from the keyboard
Returns primitive int 25
Stored directly in stack (not in heap)

```
Stack:                            Heap:
|------------------------|        |--------------------------|
|  sc   → 📍             |        | Scanner object           |
|  age  = 25             |        |--------------------------|
|------------------------|        
```

✅ Step 3: Read String input

```
String name = sc.nextLine();  // user enters: "Dharshini"
```

nextLine() reads input from console
Creates a new String object with value "Dharshini" in the heap
name is a reference stored in stack

```
Stack:                            Heap:
|------------------------|        |--------------------------|
|  sc   → 📍             |  --->  | Scanner object           |
|  age  = 25             |        |                          |
|  name → 📍             |  --->  | String: "Dharshini"      |
|------------------------|        |--------------------------|
```

| Variable      | Type      | Stored in | Points to / Holds         |
| ------------- | --------- | --------- | ------------------------- |
| `sc`          | Reference | Stack     | Points to Scanner in Heap |
| `Scanner`     | Object    | Heap      | Actual Scanner instance   |
| `age`         | Primitive | Stack     | Directly holds value `25` |
| `name`        | Reference | Stack     | Points to String in Heap  |
| `"Dharshini"` | Object    | Heap      | Actual character data     |

🧩 Key Concepts Recap:
Scanner sc = new Scanner(System.in)
→ Reference sc in stack, object in heap

sc.nextInt()
→ Returns primitive value → stored directly in stack

sc.nextLine()
→ Returns String (object) → object in heap, reference in stack

Java memory:
Stack = short-lived, per method
Heap = shared, for objects, cleaned by Garbage Collector


## Access Modifiers

Access Modifiers are used to control the accessibility of classes, methods, and variables. They determine whether other classes can access these members or not.
There are four types of access modifiers in Java:
1. Public
2. Private
3. Protected
4. Default (No modifier)

1. Public: Public members can be accessed from any class.
2. Private: Private members can only be accessed within the same class.
3. Protected: Protected members can be accessed within the same class and any subclass.
4. Default: Default members can be accessed within the same class and any class in the same package

```
| Feature                                         | `default` (no modifier) | `protected`                            |
| ----------------------------------------------- | ----------------------- | -------------------------------------- |
| Access in **same package**                      | ✅ Yes                   | ✅ Yes                                  |
| Access in **different package**                 | ❌ Not allowed           | ✅ Allowed **only in subclasses**       |
| Inheritance in other packages                   | ❌ Not accessible        | ✅ Accessible through **subclass** only |
| Direct access (non-subclass) from other package | ❌ Not allowed           | ❌ Not allowed                          |

```

```
package mypack;

public class A {
    protected int protectedVar = 10;
    int defaultVar = 20;
}
```

```
package otherpack;
import mypack.A;

public class B extends A {
    public void show() {
        System.out.println(protectedVar); // ✅ Allowed: inherited
        // System.out.println(defaultVar); // ❌ Error: defaultVar not accessible
    }
}
```

## Constructors

- Constructors are special methods of a class that are used to initialize objects when they are created. 

- They have the same name as the class and do not have a return type, not even void. 

- Constructors are used to set the initial state of an object. 

- If a class has a constructor, it will be called when an object of that class is created. 

- If a class does not have a constructor, the compiler will provide a default constructor.

- A class can have multiple constructors.

- The constructor is called when an object is created using the new keyword.

```
class Car{
    private String color;
    private int speed;

    public Car(){   // Constructor of class Car

    }
}
```

## Constructor Overloading

- Constructor overloading is a feature of Java that allows a class to have multiple constructors with different parameters.

- A class can have multiple constructors but they must differ in their parameter list.

## Encapsulation

- Encapsulation is the concept of wrapping up data into a single unit. 

- Class in java is the best example of encapsulation. A class is a unit which contains data and methods. Data is encapsulated in the class and methods are used to manipulate the data.

- A class encapsulates different types of data which includes primitive, object and array. It also encapsulates methods which are used to manipulate the data.

## Abstraction

- Abstraction is the concept of showing only necessary information to the outside world while hiding the internal details.

- Abstraction helps to reduce complexity and improves data security by showing only the necessary information to the outside world.

- Abstraction is achieved by using abstract classes and interfaces in java.

- Abstract classes can have both abstract and non-abstract methods.

- Abstract methods have only declaration with abstract keyword and no definition.

- Objects can't be created for abstract classes.

- Abstract methods can be defined by overriding the abstract class in the subclass.

- Interfaces in java are abstract classes which can't be instantiated and can't have any state.

- Interfaces can also abstract and non-abstract methods

- Interfaces are inherited in subclass via implements keyword

- Interfaces can be used to achieve multiple inheritance in java.

## Inheritance

- Inheriatance is the concept that allows a class to acquire properties and behavior (methods) from another class.
- The new class is called the subclass or derived class.
- The existing class is called the superclass or base class.
- Inheritance is used to achieve code reusability.

```
| Type                                | Description                                                      | Supported in Java?                                   |
| ----------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------- |
| 1. Single Inheritance               | One class inherits from another class                            | ✅ Yes                                                |
| 2. Multilevel Inheritance           | A class inherits from a class which itself inherits from another | ✅ Yes                                                |
| 3. Hierarchical Inheritance         | Multiple classes inherit from one base class                     | ✅ Yes                                                |
| 4. Multiple Inheritance (via class) | A class inherits from more than one class                        | ❌ Not supported with classes (but ✅ with interfaces) |
| 5. Hybrid Inheritance               | Combination of two or more types                                 | ✅ Supported via interfaces only                      |
```
#### Eventhough both abstract class and interface has abstract method but why only interface is used for multiple inheritance?

**Multiple Inheritance with Interfaces**
=====================================

In object-oriented programming, multiple inheritance is a feature that allows a class to inherit properties and behavior from more than one superclass. However, in languages like Java, multiple inheritance is not directly supported for classes due to the "diamond problem." Instead, interfaces are used to achieve multiple inheritance.

**The Diamond Problem**
--------------------

The diamond problem occurs when two classes, `B` and `C`, inherit from a common superclass `A`, and a class `D` tries to inherit from both `B` and `C`. This creates a conflict because `D` would inherit two different implementations of the same method from `B` and `C`.

```
  A
 / \
B   C
 \ /
  D
```

**Why Interfaces are Used for Multiple Inheritance**
------------------------------------------------

Interfaces are used to achieve multiple inheritance because they only define a contract or a set of methods that must be implemented, without providing any implementation themselves. This avoids the diamond problem because interfaces do not have a concrete implementation that can conflict with other interfaces.

In contrast, abstract classes can provide a default implementation for methods, which can lead to conflicts when multiple inheritance is involved.

**Example: Using Interfaces for Multiple Inheritance**
---------------------------------------------------

Suppose we have two interfaces, `Printable` and `Shareable`, that define methods for printing and sharing documents, respectively.

```
public interface Printable {
    void print();
}

public interface Shareable {
    void share();
}
```

We can then create a class `Document` that implements both interfaces.

```
public class Document implements Printable, Shareable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void share() {
        System.out.println("Sharing document...");
    }
}
```

In this example, the `Document` class can inherit behavior from both `Printable` and `Shareable` interfaces without any conflicts.

#### what is the difference between using void operation(); and abstract void operation(); in java?

## Polymorphism

- Poly means many, morphism means form. So, polymorphism is the ability of an object to take on many forms. 

- The most common use of polymorphism is method overloading and method overriding.

- Method overloading is when two or more methods have the same name but different parameters. The method that gets called is determined by the number and types of the parameters passed to it.

- Method overriding is when a subclass provides a different implementation of a method that is already defined in its superclass.

# Final

- The final keyword in Java can be used for variables, methods, and classes — and each has a different meaning.

## final variables (constants)
Meaning: Once a value is assigned, it cannot be changed.

Used for constants.

```
class Test {
    final int x = 10;
    void change() {
        // x = 20; ❌ Error: cannot assign a value to final variable x
    }
}
```

## final methods
```
class Parent {
    final void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    // void display() {} ❌ Error: cannot override final method
}
```

## final class

```
final class Parent {}

class Child extends Parent {}  // ❌ Error: cannot subclass a final class
```