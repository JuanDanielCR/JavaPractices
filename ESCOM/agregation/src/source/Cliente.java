package source;

public class Cliente {
	private String nombre;
	/**Agregation of Cuenta class with cardinality = 1*/
	private Cuenta cuenta;
	private String numCuenta;
	public Cliente(String nom){
		this.nombre = nom;
	}
	public String obtenerNombre(){
		return nombre;
	}
	public Cuenta obtenerCuenta(){
		return cuenta;
	}
	public void establecerCuenta(Cuenta cta){
		this.cuenta = cta;
	}
	public String obtenerNumCta(){
		return numCuenta;
	}
	public void crearNumCuenta(String num){
		this.numCuenta = num;
	}
}
