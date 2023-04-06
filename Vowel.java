package practice2;
import java.util.*;

public class Vowel {
	
	public class vowel {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        String str="priteshporwal";
	        String s = "";
	        int count = 0;
	      //  Scanner sc = new Scanner(System.in);
	      //  str = sc.nextLine();
	        
	            for(int  i = 0 ; i < str.length() ; i++)
	            {
	                char ch = str.charAt(i);

	            if((ch == 'A')||(ch == 'E')||(ch == 'O')||(ch == 'I')||(ch == 'U')||(ch == 'a')||(ch == 'e')||(ch == 'i')||(ch == 'o')||(ch == 'u'))
	            {
	                s = s + Character.toUpperCase(ch);
	                count++;
	               // System.out.println(ch);
	            }
	            else {
	                s = s + Character.toLowerCase(ch);
	            }
	            
	        }
	        System.out.println(s);
	        System.out.println(count);

	    }

	}

}
