/*
Output Pattern: 
* * * * * 
  * * * * 
    * * * 
      * * 
        * 
        * 
      * * 
    * * * 
  * * * * 
* * * * * 
*/

public class Main
{
	public static void main(String[] args) {
	    int flag1 = 0;
		for(int i=0;i<5;i++){ 
		    for(int k=0;k<flag1;k++){
		        System.out.print(" "+" ");
		    }
		    for(int j= 4-flag1; j>=0; j--){
		        System.out.print("*"+" ");
		    }
		    flag1++;
		    System.out.println();
		}
		int flag2 = 4;
		for(int i=0;i<5;i++){ 
		    for(int k=flag2;k>=1;k--){
		        System.out.print(" "+" ");
		    }
		    for(int j= 4-flag2; j>=0; j--){
		        System.out.print("*"+" ");
		    }
		    flag2--;
		    System.out.println();
		}
		
	}
}
