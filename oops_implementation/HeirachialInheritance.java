// Types of inheritance: Multi-level, heirarchial, hybrid, multiple(can't be implemented)
// A  -> B,C


class Parent{
    public Parent(){
        System.out.println("Message from Parent class constructor");
    }
    public void parentMethod(){
        System.out.println("Method in Parent");
    }
}

class ChildA extends Parent{
    
}

class ChildB extends Parent{
    
}

class HeirarchialInheritance{
    public static void main(String[] args){
        ChildA child_a = new ChildA();
        ChildB child_b = new ChildB();
        child_a.parentMethod();
        child_b.parentMethod();
    }
}