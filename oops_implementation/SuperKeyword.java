// Super keyword can be used to call parent's constructor, parent's method, parent's variable

// Super keyword must be called from a place where there is instance of an objects like inside 
// constructor not from main function

// The main purpose of super keyword is to access data from parent class 

// Static methods (like main) ❌
// Because there’s no object → no parent part exists.

// Outside class methods ❌
// You can’t just write super.display() in global code.

// super() can be called only from child class constructor

class Parent{
    int var = 10;
    public Parent(){
        System.out.println("Message from Parent class constructor");
    }
    public void parentMethod(){
        System.out.println("Method in Parent");
    }
}

class Child extends Parent{
    public Child(){
        super();
        System.out.println("Calling variable in parent class via super: "+super.var);
        super.parentMethod();
    }
    
    public void childMethod(){
        // super();
        System.out.println("Calling variable in parent class via super: "+super.var);
        super.parentMethod();
    }
}

class SuperKeyword{
    public static void main(String[] args){
        Child child = new Child();
        child.childMethod();
    }
}