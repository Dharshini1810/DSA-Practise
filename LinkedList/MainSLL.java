public class MainSLL {
    public static void main(String[] args){
            LL linkedlist=new LL(50);
            linkedlist.insertFirst(5);
            linkedlist.insertFirst(7);
            linkedlist.display(); 
            linkedlist.insertLast(34);
            linkedlist.insertLast(70);
            linkedlist.insertLast(45);
            linkedlist.insertLast(89);
            linkedlist.insertAtIndex(29,4); 
            linkedlist.display(); 
            linkedlist.deleteFirst();
            linkedlist.deleteLast();
            linkedlist.deleteIndex(2);
            linkedlist.display();  
            linkedlist.find(29); 
    }        
}
