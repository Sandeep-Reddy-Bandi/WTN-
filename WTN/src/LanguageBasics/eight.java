package LanguageBasics;
import java.util.*;
public class eight {
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);

	char c=sc.next().charAt(0);
	if(c>='1' &&c<='9')
	{
	System.out.println("digit");
	}
	else if(c>='A' && c<='Z' || c>='a' && c<='z')
	{
	System.out.println("alphabets");
	}
	else
	{
	System.out.println("special character");
	}
	}
}
