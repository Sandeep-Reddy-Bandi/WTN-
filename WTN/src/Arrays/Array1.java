package Arrays;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[20];
	for(int i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
	}
	int sum=0,count=0;
	for(int i=0;i<n;i++)
	{
	sum=sum+a[i];
	count++;
	}
	int avg=sum/count;
	System.out.println("sum is:"+sum);
	System.out.println("avg is:"+avg);
	}
}
