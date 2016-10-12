package sources;

public class Circle extends GeometricObject{
	private double radius;
	public Circle(){
		super();
		this.radius = 10;
	}
	public Circle(double r){
		super();
		this.radius = r;
	}
	public void setRadius(double r){
		this.radius =r;
	}
	public double getRadius(){
		return radius;
	}
	public double getDiameter(){
		return radius * 2;
	}
	@Override
	public double getArea(){
		return (Math.PI*Math.pow(radius, 2));
	}
	@Override
	public double getPerimeter(){
		return Math.PI*(radius*2);
	}
}
