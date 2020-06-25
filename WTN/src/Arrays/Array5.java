package Arrays;
import java.util.*;
public class Array5 {
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
System.out.println("1 smallest"+array[0]+" ");
System.out.println("2 smallest"+array[1]+" ");
System.out.println("1 largest"+array[n-1]+" ");
System.out.println("2 largest"+array[n-2]+" ");

}
}
