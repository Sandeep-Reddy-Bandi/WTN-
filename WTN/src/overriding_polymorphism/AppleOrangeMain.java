package overriding_polymorphism;
import java.util.*;
class fruit

{
protected char name, taste, size;

Scanner sc = new Scanner(System.in);
public void eat( )
{
System.out.println("enter the name of the fruit ");
name =sc.next().charAt(0);
System.out.println("please provide the taste of the fruit");
taste =sc.next().charAt(0);
System.out.println("Name of the fruit is: "+name);
System.out.println("Taste of the fruit is:"+taste);

}

}

class apple extends fruit
{
public void eat()
{
super.eat();
System.out.println(" Name of the fruit is :"+name);

System.out.println(" Taste of the fruit is :"+taste);
} 

}

class orange extends fruit
{
public void eat()
{
super.eat();
System.out.println(" Name of the fruit is :"+name);

System.out.println(" Taste of the fruit is :"+taste);
} 

}

class AppleOrangemain

{ 
	public static void main(String[] args)
{
   apple A = new apple() ;
   A.eat() ;
   orange O = new orange() ;
   O.eat() ;
}

}
