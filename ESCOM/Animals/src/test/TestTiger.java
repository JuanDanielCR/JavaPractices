package test;
import sources.*;
public class TestTiger {
	public static void main(String args[]){
		//Constructors are executed from the top class to its children	
		//3 constructors executed
		Tiger t = new Tiger();
		//Also 3 constructors
		Mammal m = new Tiger();
		//Only 2 constructors
		Mammal m2 = new Mammal();
		
		//There are three talkAnimal methods, by dynamic dispatch, the closest method to the object reference will be called.
		System.out.println("Using dynamic dispatch");
		t.talkAnimal();
		m.talkAnimal();
		m2.talkAnimal();
		
		//Polymorphism with Liskov Substitution Principle
		System.out.println("I'm a tiger using Tiger and Mammal methods, variables");
		t.attack();
		t.feedAnimal();
		t.level = 0;
		t.food = "Humanos";
		System.out.println("I'm a Mammal with Tiger constructor, but I can only use Mammal methods and variables");
		m.feedAnimal();
	}
}
