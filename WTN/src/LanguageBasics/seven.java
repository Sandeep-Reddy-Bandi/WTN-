package LanguageBasics;
import java.util.*;
public class seven {
	 public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      
	      String str = sc.nextLine();
	      char charArray[] = str.toCharArray();
	      Arrays.sort(charArray);
	      System.out.println(new String(charArray));
	   }
}
