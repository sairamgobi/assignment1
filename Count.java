package s1;
import java.util.*;
public class Count {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 String str = s.nextLine();
		 int uc = 0 , lc = 0 ,c1 = 0 ,d = 0,v = 0 ,cn =0 ,h = 0;
		 for(char c : str.toCharArray()) {
			 if(Character.isUpperCase(c)) {
				char t = Character.toLowerCase(c);
				System.out.print(t);
				uc++;
			 } 
			 else if(Character.isLowerCase(c)) {
				 char t = Character.toUpperCase(c);
				 System.out.print(t);
				 lc++;
			 } 
			 else if(!Character.isLetterOrDigit(c)){
				 c1++;
			 }
			 else if(Character.isDigit(c)) {
				 d++;
			 }
		 }
		 for(char n : str.toCharArray()) {
		   char u1 = Character.toLowerCase(n);
			 if(u1 == 'a'||u1 == 'e'||u1 == 'i'||u1 == 'o'||u1 == 'u') {
				 v++;
			 }else if(Character.isLetter(n)&&!(u1 == 'a'||u1 == 'e'||u1 == 'i'||u1 == 'o'||u1 == 'u')) {
				 cn++;
			 }
			 else if(Character.isWhitespace(u1)) {
				 h++;
			 }
		 }
		 System.out.println();
		 System.out.println("Lower Case Count : "+ lc);
		 System.out.println("Upper Case Count : "+ uc);
		 System.out.println("Special Characters Count : "+c1);
		 System.out.println("Numbers Count : "+d);
		 System.out.println("Vowels Count : "+v);
		 System.out.println("Consonants Count : "+d);
		 System.out.println("WhiteSpace Count : "+h);
	}

}
