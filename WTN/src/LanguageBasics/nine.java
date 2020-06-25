package LanguageBasics;
import java.util.*;
public class nine {
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	String g=sc.nextLine();
	String m="male";
	String f="female";
	int age=sc.nextInt();
	if(g.equals(f))
	{
	if(age>1 && age<58)
	{
	System.out.println(" interest is 8.2%");
	}
	else
	{
	System.out.println("interest is 9.2%");
	}
	}
	if(g.equals(m))
	{
	if(age>1 && age<58)
	{
	System.out.println(" interest is 8.4%");
	}
	else
	{
	System.out.println("interest is 10.5%");
	}
	}

	}
}
