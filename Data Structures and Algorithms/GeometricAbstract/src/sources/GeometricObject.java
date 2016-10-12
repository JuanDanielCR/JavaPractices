package sources;

import java.util.Date;

public abstract class GeometricObject {
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	protected GeometricObject(){
		this.color = "Red";
		this.filled = false;
		this.dateCreated = new Date();
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public boolean isFilled(){
		return filled;
	}
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	public Date getCreatedDate(){
		return dateCreated;
	}
	@Override
	public String toString(){
		return "Color: " + color + "Fecha: "+ dateCreated;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}
