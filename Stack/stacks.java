//Stack is a linear datastructure which follow the principle of Last in First Out or First in Last Out(LIFO or FILO). 
//Both push and pop operation take place on one end ie on "top". Removing element from middle or inserting element at a particular index 
//is not possible in stack...
import java.util.Stack;  
public class stacks{
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(12);
        stack.push(19);
        stack.push(22);
        stack.push(31);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}