package sources;

public class Rectangle extends GeometricObject {
	private double width;
	private double height;
	
	public Rectangle() {
		super();
		this.height = 1;
		this.width = 1;
	}
	public Rectangle(double h, double w){
		this.height = h;
		this.width = w;
	}
	public double getWidth(){
		return width;
	}
	public void setWidth(double w){
		this.width = w;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double getArea(){
		return width*height;
	}
	@Override
	public double getPerimeter(){
		return (2*width + 2*height);
	}
}
