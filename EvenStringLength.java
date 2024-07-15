package s1;
import java.util.*;
public class String2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String str1[] = str.split(" ");
		for(String st : str1) {
		if(st.length()%2 == 0){
			
			System.out.println(st+" Length :"+ st.length());
		}
		else {
			System.out.println();
		}
	}

}}
