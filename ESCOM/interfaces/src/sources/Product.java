package sources;

public class Product {
	private String idProducto;
	private String nombre;
	
	public Product(String idProd, String nombre){
		this.idProducto = idProd;
		this.nombre = nombre;
	}
	public String getIdProducto(){
		return idProducto;
	}
	public String getNombre(){
		return nombre;
	}
}