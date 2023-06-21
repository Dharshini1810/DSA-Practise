public class main {
    public static void main(String[] args){
        stackcustom s1=new stackcustom(5);
        s1.push(12);
        s1.push(4);
        s1.push(1);
        s1.pop(); 
        s1.peak();
        stackusingll s=new stackusingll(9);
        s.push(12);
        s.push(1);
        s.push(13);
        s.push(60);
        s.display();
        s.pop();
        s.display();
        s.peak();


    }
    
}
