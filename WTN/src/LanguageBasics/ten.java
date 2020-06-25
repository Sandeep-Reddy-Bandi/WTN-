package LanguageBasics;
import java.util.*;
public class ten {
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	if(s.charAt(0)>='A' && s.charAt(0)<='Z')
	{
	String b=s.toLowerCase();
	System.out.print(s+"->"+b);
	}
	else
	{
	System.out.println(s+"->"+s.toUpperCase());
	}
	}
}
