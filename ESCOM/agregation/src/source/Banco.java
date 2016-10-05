package source;

public class Banco {
	private Cliente[] clientes;
	private int numClientes;
	public Banco(){
		this.numClientes = 0;
	}
	public void agregaCliente(String nom, String numCta){
		numClientes++;
	}
	public int obtenerNumCliente(){
		return 0;
	}
	public Cliente obtenerCliente(int indice){
		return clientes[indice];
	}
	public void imprimirClientes(){
		for(int i=0; i<numClientes;i++){
			System.out.println(clientes[i].toString());
		}
	}
}
