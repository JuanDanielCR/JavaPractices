package sources;

public class Tiger extends Mammal{
	public int level;
	@Override
	public String toString(){
		return "I am a Tiger";
	}
	public Tiger(){
		super();
		System.out.println("Tiger simple");
	}
	public Tiger(byte edad, String comida){
		super(edad,comida);
		System.out.println("Tiger Params");
	}
	public void attack(){
		System.out.println("Just tigers attacks");
	}
	@Override
	public void talkAnimal(){
		System.out.println("Soy un tigre");
	}
}
