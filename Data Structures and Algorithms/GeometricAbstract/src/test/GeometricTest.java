package test;
import sources.*;
public class GeometricTest {
	public static void main(String []args){
		Circle c = new Circle(20);
		Rectangle r = new Rectangle(10, 10);
		
		System.out.println("Area c: "+c.getArea());
		System.out.println("Area r: "+r.getArea());
		System.out.println("Perimetro c: "+c.getPerimeter());
		System.out.println("Diametro c: "+c.getDiameter());
		System.out.println("Perimetro r: "+r.getPerimeter());
		r.setColor("Blue");
		System.out.println("Color c: "+c.getColor()+" Color r:"+r.getColor());
	}
}
