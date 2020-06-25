package String_StringBuffer;
import java.util.*;
public class Repetation {
	public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int n=sc.nextInt();
	int l=s.length();
	String sub=s.substring(l-n);
	String res="";
	for(int i=1;i<=n;i++)
	{
		res+=sub;
	}
	System.out.println(res);
}
	

}
