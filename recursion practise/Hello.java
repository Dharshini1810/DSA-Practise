//PractiseQn 1
//Given an array of integers, print a sum triangle from it such that the first level has all array elements. 
//From then, at each level number of elements is one less than the previous level and elements at the 
//level is be the Sum of consecutive two elements in the previous level. 
import java.util.*;
public class Hello {
    public static void SumofTriangle(ArrayList<Integer>a){
        if(a.size()==1){
            System.out.println(a);
            return;
        }
        ArrayList<Integer> b=new ArrayList<Integer>();
        ArrayList<Integer> c=new ArrayList<Integer>();
        for(int i=0;i<a.size()-1;i++){
            b.add(a.get(i)+a.get(i+1));
        }   
        c.addAll(a);
        a.clear(); 
        a.addAll(b); 
        SumofTriangle(a);  
        System.out.println(c);
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		ArrayList<Integer> a=new ArrayList<Integer>();
		while(sc.hasNext()){
		    a.add(sc.nextInt());
		}
        SumofTriangle(a);  

	}
}