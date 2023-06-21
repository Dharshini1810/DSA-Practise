//Circular Singly Linkedlist
public class CSLL {
    private Node head=null;
    private Node tail=null;
    private int size=0;
    public CSLL(int value){
        head=new Node(value);
        head.next=head;
        size+=1;
        tail=this.head;

    }
    public void insert(int val){
        Node node=new Node(val);
        //If only one element is present in list so head.next will be pointed towards head
        if(head.next==head){
            //if condition can also be written as (head==tail)
            head.next=node;
            node.next=head;
            tail=tail.next; 
            // or tail=node;
            size+=1;
        }
        else{
            tail.next=node; 
            node.next=head; 
            tail=node;
            // or it can be written using while loop without using tail
            //Node temp=this.head; 
            //while(temp.next!=head){
            //temp=temp.next;
            //}
            //temp.next=node;
            //node.next=head;
            size+=1; 
        }
    }    
        public void insertIndex(int value,int index){
            Node node=new Node(value);
            Node temp=this.head;
            for(int i=1;i<index-1;i++){
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
            size+=1;
        }
        public void delete(int value){
            Node temp=this.head; 
            Node prev=this.head;
            while(temp.value!=value){
                prev=temp;
                temp=temp.next;
            }
            prev.next=temp.next;
        }
    //  Time complexity O(N)
        public void display(){
        Node temp=this.head;
        do{
            System.out.print(temp.value+"->");
            temp=temp.next;
            tail=tail.next;
        }while(temp!=this.head);
        System.out.println("HEAD");
    }

    public class Node{
        int value;
        Node next=null;
        Node(int value){
            this.value=value;
        } 
        Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    
}
