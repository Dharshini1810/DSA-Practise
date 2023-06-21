import java.util.*;
public class LinearSearch {
    public static ArrayList<Integer> linearSearch(int[] a,int t,int i){
        ArrayList<Integer> b=new ArrayList<Integer>();
        if(i==a.length){
            return b;
        }
        else if(a[i]==t){
            b.add(i);
        }
        ArrayList<Integer> n=linearSearch(a,t,++i);
        b.addAll(n);
        return b;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt(); 
		int[] a=new int[n]; 
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		} 
	    int t=sc.nextInt(); 
	    int index=0;
	    System.out.print(linearSearch(a,t,index));
	}
}
