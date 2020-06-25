package String_StringBuffer;
import java.util.*;
public class StringStar {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	String res="";
	for(int i=0;i<s.length()-1;i++)
	{
		if(s.charAt(i+1)!='*')
		{
			res+=s.charAt(i);
		}
		else
			i+=2;
		
	}
	if(s.charAt(s.length()-2)!='*')
	     System.out.println(res+s.charAt(s.length()-1));
	else
		System.out.println(res);
}
}
