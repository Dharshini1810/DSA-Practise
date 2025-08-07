public class Constructors {
    
    // Constructor with no parameters
    public Constructors(){
        System.out.println("Message from Constructor1");
    }

    // Constructor with two int parameters
    public Constructors(int a, int b){
        System.out.println("Message from Constructor2");
    }

    // Constructor with two float parameters
    public Constructors(float a, float b){
        System.out.println("Message from Constructor3");
    }

}

class Main {
    public static void main(String[] args) {
        
        
        Constructors c1 = new Constructors();  //Message from Constructor1
        Constructors c2 = new Constructors(1, 2);  //Message from Constructor2
        Constructors c3 = new Constructors(1.0f, 2.0f);  //Message from Constructor3

    }

}

