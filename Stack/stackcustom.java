//Stack implementation using Arrays
public class stackcustom {
    int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
    stackcustom(int size){
        this.data=new int[size];
    }
    stackcustom(){
        this.data=new int[DEFAULT_SIZE];
    }
    public boolean push(int item){
        if(ptr==data.length-1){
            System.out.println("Stack is full"); 
            return false;
        }
        else{
            ptr++; 
            data[ptr]=item; 
            return true;
        }    
    }   
    public boolean pop(){
        if(ptr==-1){
            System.out.println("Stack in empty");
            return false;
        }
        else{
            System.out.println("deleted element "+data[ptr]); 
            ptr--; 
            return true;
        }
    }
    public void peak(){
        System.out.println(data[ptr]);
    }
}
