import java.util.*;
public class KadaneAlgo
{
	public static void main(String[] args) {
	    int[] a={-2,1,-3,4,-1,2,1,-5,4}; 
	    int sum=0,maxSum=Arrays.stream(a).max().getAsInt(); 
	    for(int i=0;i<a.length;i++){
	        if(sum+a[i]<0){
	            sum=0;
	        } 
	        else{
	            sum+=a[i];
	            maxSum=Math.max(maxSum,sum); 
	        }
	    }
	    System.out.print(maxSum);
	}	
}