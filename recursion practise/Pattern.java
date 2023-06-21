import java.util.*; 
public class Pattern{
    public static void pattern(int index,int n){
        if(index==n){
            return;
        } 
        pattern(index+1,n); 
        for(int i=0;i<index;i++){
            System.out.print("*"+" ");
        } 
        System.out.println();
    }
    public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        pattern(0,n);
    }
}