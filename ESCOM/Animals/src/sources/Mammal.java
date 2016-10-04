package sources;

public class Mammal extends Animal{
	public String food;
	public Mammal(){
		super();
		this.food = "Leche";
		System.out.println("Mammal simple");
	}
	public Mammal(byte edad, String comida){
		super(edad);
		this.food = comida;
		System.out.println("Mammal params");
	}
	public void feedAnimal(){
		System.out.println("Mammal - Alimentando");
	}
	@Override
	public void talkAnimal(){
		System.out.println("Soy un mamifero");
	}
}