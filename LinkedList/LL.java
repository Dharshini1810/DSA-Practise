//Singly Linkedlist 
import java.util.*;
public class LL{
    private Node head=null;
    private int size;
    public LL(int val){
        head=new Node(val);
    }
    public LL(){
        this.size=0;
    } 
    //Time complexity O(1)
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=this.head;
        this.head=node;
        // if(tail==null){
        //     this.head=this.tail;
        // }
        // System.out.print("Hello");
        size+=1;
    }
    //Time complexity O(N) N is the no of node to be traversed
    public void insertLast(int val){
        Node node=new Node(val);
        if(this.head==null){
            insertFirst(val);
        }            
        else{
            Node temp=this.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            size+=1;
        }
    }
    //Time complexity O(N) N is the no of nodes to be traversed
    public void insertAtIndex(int val,int ind){
        Node node=new Node(val);
        Node temp=this.head;
        Node after=this.head;
        if(ind==0){
            insertFirst(val);
        }
        else if(ind==size){
            insertLast(val);
        }
        else{
            int t=1;
            while(t!=ind-1){
                temp=temp.next;
                t+=1;
            }
            after=temp.next;
            temp.next=node;
            node.next=after;
            size+=1;
        }
    }
    //Time complexity O(1)
    public void deleteFirst(){
        int deletedvalue=this.head.value;
        head=head.next;
        System.out.println(deletedvalue+" "); 
        size-=1;
    }
    //Time complexity O(N)
    //but if we use tail TC would be O(1)
    public void deleteLast(){
        int val;
        Node temp=this.head;
        Node prev=temp; 
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        val=temp.value; 
        System.out.println(val);
        prev.next=null;
        size-=1; 
    } 
    //Time complexity O(N)
    public void deleteIndex(int index){
        Node temp=this.head;
        Node prev=this.head; 
        if(index==0){
            deleteFirst();
        }
        else if(index==size){
            deleteLast();
        }
        else{
            int i=0;
            while(i!=index-1){
                prev=temp;
                temp=temp.next;
                i+=1;
                //or you can directly do it as prev.next=prev.next.next; only using prev node
            }
            prev.next=temp.next;
            size-=1;
        }

    } 
    // for finding the a particular node the time complexity is O(N) where N is the no of traversing!!
    public void find(int val){
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
    }
    //Time complexity O(N)
    public void display(){
        Node temp=this.head; 
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    class Node{
        int value;
        Node next=null;
        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }

}