package LanguageBasics;

import java.util.Scanner;

public class twenty {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();;
	int sum=0;
	int temp=n;
	while(n>0)
	{
	int rem=n%10;
	sum=sum*10+rem;
	n=n/10;
	}
	if(sum==temp)
	{
	System.out.println(sum+" "+"is a palindrome");
	}
	else
	{
	System.out.println(sum+" "+"is not a palindrome");
	}
	}
}
