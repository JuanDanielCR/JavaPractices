package source;

public class Shape extends Object{
	//Extends object by default if not specified
	private int id;
	int sides;
	protected String color;
	public String name;
	
	public Shape(int id, int sides, String color, String name){
		//super(); of Object
		this.id = id;
		this.sides =  sides;
		this.color = color;
		this.name = name;
	}
	
	@Override
	public String toString(){
		//Specialize providing a new implementation
		return "Shape{ id = " + id + " Sides = "+sides+" Color = "+ color + " Nombre"+ name + "}";
	}
}
