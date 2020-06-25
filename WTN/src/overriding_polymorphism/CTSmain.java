package overriding_polymorphism;
class shape
{
	void draw()
	{
		System.out.println("Drawing shape");
		
	}
	void erase()
	{
		System.out.println("Erasing shape");
		
	}
}
class circle extends shape
{
	void draw()
	{
		System.out.println("Drawing circle");
		
	}
	void erase()
	{
		System.out.println("Erasing circle");
		
	}
}
class triangle extends shape
{
	void draw()
	{
		System.out.println("Drawing triangle");
		
	}
	void erase()
	{
		System.out.println("Erasing triangle");
		
	}
}
class square extends shape
{
	void draw()
	{
		System.out.println("Drawing square");
		
	}
	void erase()
	{
		System.out.println("Erasing square");
		
	}
}

public class CTSmain {
	public static void main(String[] args)
	{
		shape c=new circle();
		c.draw();
		c.erase();
		shape t=new triangle();
		t.draw();
		t.erase();
		shape s=new square();
		s.draw();
		s.erase();
		
	}

}
