package String_StringBuffer;
import java.util.*;
public class Combinationofstrings {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	int n1=s1.length();
	int n2=s2.length();
	int i=0,j=0;
	String res="";
	while(i<n1 && j<n2)
	{
		res+=s1.charAt(i);
		i++;
		res+=s2.charAt(j);
		j++;
	}
	while(i<n1)
	{
		res+=s1.charAt(i);
		i++;
		
	}
	while(j<n2)
	{
		res+=s2.charAt(j);
		j++;
		
	}
	System.out.println(res);
}
}
