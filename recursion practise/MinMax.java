//PractiseQn 2
//To find min and max value of array using recursion
import java.util.*;
public class MinMax {
    static int max=Integer.MIN_VALUE; 
    static int min=Integer.MAX_VALUE;
    public static void maxmin(ArrayList<Integer> a,int cnt){
        if(cnt==a.size()){
            System.out.print("Min: "+min+" "+"Max: "+max);
            return;
        }
        if(a.get(cnt)>max){
            max=a.get(cnt);
        } 
        if(a.get(cnt)<min){
            min=a.get(cnt);
        } 
        maxmin(a,++cnt); 
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		ArrayList<Integer> a=new ArrayList<Integer>(); 
		while(sc.hasNext()){
		    a.add(sc.nextInt());
		} 
		int cnt=0;
		maxmin(a,cnt);

	}
}
