package test;
import sources.*;
public class TestAnimals {
	public static void main(String args[]){
		
		Animal cat1 = new Cat();
		cat1.eat();
		if(cat1 instanceof Cat){
			Cat copy_cat = (Cat)cat1;
			copy_cat.setName("Mufasa");
			System.out.println(copy_cat.getName());
		}
		
		Cat cat2 = new Cat();
		cat2.setName("Miau");
		System.out.println(cat2.getName());
		
		Spider sp1 = new Spider();
		sp1.eat();
		
		Fish fs1 =  new Fish();
		fs1.setName("Tiburoncin");
		System.out.println(fs1.getName());
		fs1.walk();
		
		//Casting with interface
		Pet fs2 =  new Fish();
		if(fs2 instanceof Pet){
			Fish copy_fish = (Fish) fs2;
			copy_fish.walk();
		}
	}
}
