package source;

public class Circle extends Shape {
	private double radio;
	public Circle(double radio, int id, int sides, String color, String name){
		//Calling to the superclass constructor with super();
		super(id, sides, color, name);
		//Augmenting super class constructor
		this.radio = radio;
	}
	
	@Override
	public String toString(){
		//Augmenting toString() method by concatenating another string
		return super.toString() + "{ radio = "+radio+"}";
	}
}
