// Interface declaration
interface Interface {

    // All variables in an interface are public, static and final by default
    int x = 10;

    // Abstract method (must be implemented by the implementing class)
    void operation();

    // Default method (has a body, can be overridden)
    default void show() {
        System.out.println("Default method inside interface: show()");
    }

    // Static method (belongs to interface, cannot be overridden)
    static void info() {
        System.out.println("Static method inside interface: info()");
    }
}

// Implementing class
class Main implements Interface {

    // Constructor
    public Main() {
        // Accessing interface variable
        System.out.println("Inside constructor: x = " + x);
    }

    // Implementing the abstract method from interface
    @Override
    public void operation() {
        System.out.println("operation() implementation inside Main class");
    }

    // Overriding default method (optional)
    @Override
    public void show() {
        System.out.println("Overridden default method: show() in Main class");
    }

    // Main method
    public static void main(String[] args) {
        // Accessing static variable from interface
        System.out.println("Accessing x from main: x = " + x);

        // Creating object of Main class
        Main obj = new Main();

        // Calling implemented method
        obj.operation();

        // Calling overridden default method
        obj.show();

        // Calling static method from interface using interface name
        Interface.info();
    }
}
