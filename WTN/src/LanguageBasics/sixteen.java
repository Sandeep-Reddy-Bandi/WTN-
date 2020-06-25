package LanguageBasics;

import java.util.Scanner;

public class sixteen {
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	for(int num=10;num<=99;num++)
	{
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
		System.out.println(num);
	
	}
	}
}
