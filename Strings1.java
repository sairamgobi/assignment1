package s1;
import java.util.*;
public class Strings1 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String[] st = str.split(" ");
	for(String str1 : st) {
			if(!str1.isEmpty()) {
				char c1 = str1.charAt(0);
				System.out.println(c1);
			}
		}
	}
}
