package Arrays;
import java.util.*;
public class Array6 {
	public static void main (String[] args)
	{
		Scanner scn = new Scanner (System.in);
		System.out.print("Enter no. of elements you want in array:");
                int n = scn.nextInt();
 
		int array[] = new int[n];
                System.out.println("Enter all the elements:");
		for (int i = 0; i < array.length; i++)
		{
			array[i] = scn.nextInt();
		}

Arrays.sort(array,0,n);
for(int i=0;i<n;i++)
{
System.out.println(array[i]+" ");
}
}
}
