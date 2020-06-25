package ExceptionHandling;
import java.util.*;
class InvalidCountryException extends Exception{
	String d;
	InvalidCountryException(String a)
	{
		d=a;
}
	public String toString()
	{
		return (d);
	}
	}
class ExceptionHandling4{
	public static void main(String args[])
	{
		String Name,Country;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Name:");
		Name=input.nextLine();
		System.out.print("Enter Country:");
		Country=input.nextLine();
		if(Country.equals("India") || Country.equals("india"))
		{
			System.out.print(Name+" from "+Country+" successfully registered");
			}
		else{
			try{
				throw new InvalidCountryException("user outside India cannot be registered");
				}
			catch(Exception ex)

{
				System.out.println(ex);
				}
			}
		}
	}