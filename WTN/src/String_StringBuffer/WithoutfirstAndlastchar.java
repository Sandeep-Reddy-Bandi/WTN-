package String_StringBuffer;
import java.util.*;
public class WithoutfirstAndlastchar {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	String res="";
	for(int i=1;i<s.length()-1;i++)
	{
		res+=s.charAt(i);
	}
	System.out.println(res);
}
}
