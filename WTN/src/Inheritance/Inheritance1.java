package Inheritance;

class Animal {

	   public void eat() {
	      System.out.println("I can eat");
	   }

	   public void sleep() {
	      System.out.println("I can sleep");
	   }
	}

	class Bird extends Animal {
	   public void fly() {
	      System.out.println("I can fly");
	   }
	}

	public class Inheritance1 {
	   public static void main(String[] args) {

	      Bird ob1 = new Bird();

	      ob1.eat();
	      ob1.sleep();

	      ob1.fly();
	   }
	}