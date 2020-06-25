package Arrays;
import java.util.*;
public class Array3 {

		public static int search(int arr[], int x) 
		{ 
			int n = arr.length; 
			for(int i = 0; i < n; i++) 
			{ 
				if(arr[i] == x) 
					return i; 
			} 
			return -1; 
		} 

		public static void main(String args[]) 
		{ 
			int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[50];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int result = search(arr, x); 
		if(result == -1) 
		System.out.print("-1"); 
		else
		System.out.print("Element is present at index " + result); 
		} 
}
