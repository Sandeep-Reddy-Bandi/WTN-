package LanguageBasics;

import java.util.*;

public class fifteen {
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int f=1;

	for(int i=2;i<=Math.sqrt(num);i++)
	{
	if(num%i==0)
	{
		f=0;
		break;
	}

	}
	if(f==1)
		System.out.print(num+" "+"is a prime number");
	else
		System.out.print(num+" "+"is not a prime number");
	}
}
