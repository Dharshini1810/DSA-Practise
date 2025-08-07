public class A {
    private int var1 = 10;
    protected int var2 = 20;

    public void methodA() {
        System.out.println("Method A of ClassA");
    }
    public static void main(String[] args) {
        A objA = new A();
        objA.methodA();
        System.out.println(objA.var1); //10
        System.out.println(objA.var2); //20
    }
}