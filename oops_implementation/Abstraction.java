/* 
- In java only classes and methods can be abstracted and not variables 
- Once the class is abstracted, it doesn't mean all methods in the 
class needs to be abstracted. 
- Only the methods that are abstracted will be overridden in the child class.
- If a class has only one abstract method, then the class itself is abstract class
- Abstract method can be defined by extending the class in its subclass and method 
is overridded to provide the implementation of the method.
- 
*/
abstract class Abstraction {
    // a static field
    static int x = 10;
    // a private instance field
    private int xi = 10;

    // concrete getter for xi
    public int getXi() {
        return xi;
    }

    // an abstract method to be implemented by subclasses
    public abstract void operation();

    // a concrete method
    public void display() {
        System.out.println("display() called");
    }

    // static initializer block: runs once when Abstraction is first loaded
    static {
        System.out.println("Static init in Abstraction: x = " + x);
        // Output: Static init in Abstraction: x = 10
    }
}

public class Main extends Abstraction {
    // hides Abstraction.x with an instance field of the same name
    int x = 99;

    // static initializer block for Main
    static {
        System.out.println("Static init in Main");
        // Output: Static init in Main
    }

    // instance initializer block: runs every time before the constructor
    {
        System.out.println("Instance init in Main: super.x = " + super.x);
        // Output: Instance init in Main: super.x = 10
    }

    // constructor: runs after instance initializers
    public Main() {
        System.out.println("Constructor of Main: this.x = " + this.x);
        // Output: Constructor of Main: this.x = 99
    }

    @Override
    public void operation() {
        System.out.println("operation() in Main");
        // Output: operation() in Main
    }

    // prints both the hidden (this.x) and inherited (super.x) values
    public void printBoth() {
        System.out.println("printBoth(): this.x = " + this.x + ", super.x = " + super.x);
        // Output: printBoth(): this.x = 99, super.x = 10
    }

    // uses the getter for the private xi in Abstraction
    public void useGetter() {
        System.out.println("useGetter(): xi = " + getXi());
        // Output: useGetter(): xi = 10
    }

    public static void main(String[] args) {
        // static context: access Abstraction.x directly
        System.out.println("In static main(): Abstraction.x = " + Abstraction.x);
        // Output: In static main(): Abstraction.x = 10

        Main m = new Main();
        // Triggers:
        //   • Instance init in Main
        //   • Constructor of Main

        m.operation();
        // Output: operation() in Main

        m.display();
        // Output: display() called

        m.printBoth();
        // Output: printBoth(): this.x = 99, super.x = 10

        m.useGetter();
        // Output: useGetter(): xi = 10
    }
}
