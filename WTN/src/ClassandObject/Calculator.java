package ClassandObject;
import java.util.*;

public class Calculator {

public static int powerInt(int num1,int num2)
{
	return (int)Math.pow(num1,num2);
}
public static Double powerDouble(Double num1,int num2)
{
	return Math.pow(num1,num2);
}
public static void main(String[] args)
{
	System.out.println(powerInt(2,3));
	System.out.println(powerDouble(2.0,3));
	
}
}
