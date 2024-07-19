package s1;
import java.util.*;
public class EvenASCII {

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    String str = s.next();
	    char c[] = str.toCharArray();
	   	for(int i = 0 ; i < str.length() ; i++ ) {
	    		if(c[i]%2 == 0 ) {
	    		System.out.println(c[i]);
	    	}
	   	}
    }    
}

