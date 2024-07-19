import java.util.*;
public class Count {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 String str = s.nextLine();
		 int uc = 0 , lc = 0 ,c1 = 0 ,d = 0 ;
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
		 System.out.println();
		 System.out.println("Lower Case Count : "+ lc);
		 System.out.println("Upper Case Count : "+ uc);
		 System.out.println("Special Characters Count : "+c1);
		 System.out.println("Numbers Count : "+d);
	}

}
