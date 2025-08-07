//Types of inheritance: Multi-level, heirarchial, hybrid, multiple(can't be implemented)
// A -> B -> C

class ParentOfParent{
    public void parentOfparent(){
        System.out.println("Method in Parent of Parent");
    }
}

class Parent extends ParentOfParent{
    public Parent(){
        System.out.println("Message from Parent class constructor");
    }
    public void parentMethod(){
        System.out.println("Method in Parent");
    }
}

class Child extends Parent{
    
}

class MultiLevelInheritance{
    public static void main(String[] args){
        Child child = new Child();
        child.parentMethod();
        child.parentOfparent();
    }
}