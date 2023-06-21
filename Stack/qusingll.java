public class qusingll {
    private Node head=null; 
    qusingll(int val){
        head=new Node(val);
    }
    void insert(int val){
        Node node =new Node(val);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        temp=node;
    } 
    void delete(){
        head=head.next;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    
}
