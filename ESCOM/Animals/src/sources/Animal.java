package sources;

public class Animal {
	protected byte age;
	public Animal(){
		this.age = 0;
		System.out.println("Animal simple");
	}
	public Animal(byte edad){
		this.age = edad;
		System.out.println("Animal params");
	}
	public void talkAnimal(){
		System.out.println("Soy un animal");
	}
}