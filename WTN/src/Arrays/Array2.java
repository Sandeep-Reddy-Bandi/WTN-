package Arrays;
import java.util.*;
public class Array2 {
	public int max(int [] array) {
	      int max = 0;
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]>max) {
	            max = array[i];
	         }
	      }
	      return max;
	   }
	   public int min(int [] array) {
	      int min = array[0];
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]<min) {
	            min = array[i];
	         }
	      }
	      return min;
	   }
	   public static void main(String args[]) {
	 int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	 int[] myArray = new  int[n];
	for(int i=0;i<n;i++)
	{
	myArray[i]=sc.nextInt();
	}
	     
	      Array2 m = new Array2();
	      System.out.println("Maximum value in the array is::"+m.max(myArray));
	      System.out.println("Minimum value in the array is::"+m.min(myArray));
	   }
}
