//PractiseQn 2
//Given a string find its first uppercase letter
import java.util.*;
public class firstUpperCharacter {
    static int cnt=0;
    public static char printUpper(String s,int cnt){ 
        if(cnt==s.length()){
            return '1';
        }
        if(Character.isUpperCase(s.charAt(cnt))){
            return s.charAt(cnt);
        } 
        return printUpper(s,++cnt);
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		String s=sc.next(); 
		int cnt=0;
 		System.out.print(printUpper(s,cnt));

	}
}