package sources;

public class Cat extends Animal implements Pet{
	private String name;
	private static final int legs = 4;
	
	public Cat(String name) {
		super(legs);
		this.name = name;
	}
	public Cat(){
		this(" ");
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void play() {
		System.out.println("Gato jugando");
	}
	@Override
	public void eat() {
		System.out.println("Gato comiendo");
	}
	
}
