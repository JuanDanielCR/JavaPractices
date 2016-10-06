package sources;

public class Photograph extends Product implements Sellable, Transportable{
	
	private String fechaIngreso;
	private int price;
	
	public Photograph(String idProducto, String nombre, String fecha, int price){
		super(idProducto, nombre);
		this.fechaIngreso = fecha;
		this.price = price;
	}
	public String getFechaIngreso(){
		return fechaIngreso;
	}
	@Override
	public String description(){
		String desc;
		desc = "Change the intern body of each implemented method";
		return desc;
	}
	@Override
	public int listPrice() {
		return price;
	}
	@Override
	public int lowestPrice() {
		return price/2;
	}
	@Override
	public int weigth() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isHazardous() {
		// TODO Auto-generated method stub
		return false;
	}
}
