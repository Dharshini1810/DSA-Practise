public class stackusingll {
    private Node head=null;
    public stackusingll(int val){
        head = new Node(val);
    }
    public void push(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
    }
    public void pop(){
        head=head.next;
    }
    public void peak(){
        System.out.println(head.data);
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }    
        System.out.println("END");
    }    
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
}
