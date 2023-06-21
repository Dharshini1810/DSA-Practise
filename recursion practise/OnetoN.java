import java.util.*;
public class OnetoN {
    public static void printNos(int cnt){
        if(cnt==1){
            return;
        }  
        printNos(--cnt);
        System.out.print(cnt+" ");
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		printNos(n+1);

	}
}
