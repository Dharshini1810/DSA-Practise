class B{
    int var3 = 40;
    int var4 = 50;

    public void methodB(){
        System.out.println("Method B of ClassB");
    }

    //Calling methodA of ClassA and variable of ClassA here
    public static void main(String[] args) {
        A objA = new A();
        objA.methodA();
        // System.out.println(objA.var1);  //B.java:13: error: var1 has private access in A
        System.out.println(objA.var2); //20 //as var2 of class A is protected where the variable can be accessed within the package but not in other packages.
    }
}