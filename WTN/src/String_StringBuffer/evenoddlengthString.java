package String_StringBuffer;
import java.util.*;
public class evenoddlengthString {
public static String compute(String s)
{
	if(s.length()%2!=0)
		return null;
	else
	{
		return s.substring(0,s.length()/2);
	}
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	System.out.println(compute(s));
}
}
