import java.util.*;

public class queues {
    public static void main(String[] args){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(12);
        queue.add(19);
        queue.add(1);
        queue.add(24);
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue.peek());
    }
    
}
