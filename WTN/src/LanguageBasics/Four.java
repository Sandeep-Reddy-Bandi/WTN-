package LanguageBasics;
import java.util.*;

public class Four {
	public static void main(String [] args)
	{
	int a;

	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	if(a>0)
	{
	System.out.println(a+" "+"is a positive number");
	}
	else if(a==0)
	{
	System.out.println(a+" "+"is zero");
	}
	else
	{
	System.out.println(a+" "+"is a negative number");
	}
	}
}
