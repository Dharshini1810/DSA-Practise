public class MainDLL {
    public static void main(String[] args) {
        DLL doublyll=new DLL(13);
        doublyll.insertFirst(15);
        doublyll.insertLast(29);
        doublyll.insertLast(85);
        doublyll.insertLast(12);
        doublyll.insertAtIndex(40, 2);
        doublyll.display();  
        doublyll.insertAtIndexAfter(70, 2);
        doublyll.display();  
        doublyll.insertAfterValue(70, 59);
        doublyll.display();  
        doublyll.displayRev(); 
        doublyll.deleteFirst();
        doublyll.display();
        doublyll.deleteLast();
        doublyll.display();
        doublyll.deleteIndex(3);
        doublyll.display();
        doublyll.display();  
        doublyll.size();    
    }
    
}
