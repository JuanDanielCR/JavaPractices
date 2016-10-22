package sources;

public class Fish extends Animal implements Pet{
	private static final int legs = 0;
	private String nombre;
	public Fish() {
		super(legs);
	}
	@Override
	public String getName() {
		return nombre;
	}
	@Override
	public void setName(String name) {
		this.nombre = name;
	}
	@Override
	public void play() {
		System.out.println("Pescado jugando");
	}
	@Override
	public void eat() {
		System.out.println("Pez jugando");
	}
	@Override
	public void walk(){
		System.out.println("I don´t walk "+legs+" legs, you see");
	}
}
