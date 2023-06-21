//Doubly Linkedlist
public class DLL {
    private Node head=null; 
    private Node tail=null;
    private int size=0;
    public DLL(int val){
        this.head=new Node(val);
        this.head.next=null;
        this.head.prev=null;
        tail=this.head;
        size+=1;
    }
    //Time complexity O(1)
    public void insertFirst(int val){
        Node node=new Node(val);
        node.prev=null;
        node.next=this.head;
        this.head.prev=node;
        this.head=node;
        size+=1;
    }
    //Time complexity O(N)
    public void insertLast(int val){
        Node node=new Node(val);
        if(head==null){
            node.prev=null;
            head=node;
        }
        else{
            Node temp=this.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            node.prev=temp;
        }    
        size+=1;
    }    
    //Time complexity O(N)
    public void insertAtIndex(int val,int index){
        Node node =new Node(val);
        node.prev=null;
        node.next=null;
        if(index==1){
            insertFirst(val);
        }
        else{
            Node temp=this.head;
            for(int i=1;i<index-1;i++){
                temp=temp.next;
            }
            node.prev=temp;
            node.next=temp.next;
            temp.next.prev=node;
            temp.next=node;
        }    
        size+=1;
    }
    //Time complexity O(N)
    public void insertAtIndexAfter(int val,int index){
        Node node =new Node(val);
        node.prev=null;
        node.next=null;
        if(index==1){
            insertFirst(val);
        }
        else{
            Node temp=this.head;
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            node.prev=temp;
            node.next=temp.next;
            temp.next.prev=node;
            temp.next=node;
        }    
        size+=1;
    } 
    //Time complexity O(N)
    public void insertAfterValue(int after,int value){
        int pos=find(after);
        Node node =new Node(value);
        node.prev=null;
        node.next=null;
        if(pos==1){
            insertFirst(value);
        }
        else{
            Node temp=this.head;
            for(int i=1;i<pos;i++){
                temp=temp.next;
            }
            node.prev=temp;
            node.next=temp.next;
            temp.next.prev=node;
            temp.next=node;
        }       
        size+=1;     
    } 
    //Time complexity O(1)
    public void deleteFirst(){
        System.out.println("Deleted value: "+this.head.value);
        if(head.next!=null){
            this.head=this.head.next;
        }
        size-=1;
    }
    //Time complexity O(N)
    public void deleteLast(){
        Node temp=this.head;
        while(temp.next!=null){
            temp=temp.next;
        }
        System.out.println("Deleted value: "+temp.value);
        temp=temp.prev;
        temp.next=null;
        size-=1;
    }
    //Time complexity O(N)
    public void deleteIndex(int index){
        Node temp=this.head; 
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        System.out.println("Deleted value: "+temp.value);
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        size-=1;
    }
    //Time complexity O(N)
    public int find(int val){
        int pos=0;
        Node temp=this.head;
        while(temp!=null){
            pos+=1;
            if(temp.value==val){
                System.out.println("Node found at position "+pos);
                break;
            }
            temp=temp.next;
        }
        return pos;
    }
    //Time complexity O(N)
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            tail=temp;
            temp=temp.next;
        }
        System.err.println("END");
    }
    //Time complexity O(N)
    public void displayRev(){
        Node last=tail;
        while(last!=null){
            System.out.print(last.value+"->");
            last=last.prev;
        }
        System.out.println("END");
    }
    public void size(){
        System.out.println("Size of the list "+size);
    }
    class Node{
        Node prev;
        int value;
        Node next; 
        public Node(int value){
            this.value=value;
        }
        public Node(Node prev,int value,Node next){
            this.prev=prev;
            this.value=value;
            this.next=next;
        }
    }
    
}
