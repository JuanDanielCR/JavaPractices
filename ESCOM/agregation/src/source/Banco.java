package source;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Cliente> clientes;
	private int numClientes;
	public Banco(){
		this.numClientes = 0;
		this.clientes = new ArrayList<Cliente>();
	}
	public void agregaCliente(String nom, String numCta){
		Cliente cli = new Cliente(nom);
		cli.crearNumCuenta(numCta);
		clientes.add(cli);
		numClientes++;
	}
	public int obtenerNumCliente(){
		return numClientes;
	}
	public Cliente obtenerCliente(int indice){
		return clientes.get(indice);
	}
	public void imprimirClientes(){
		for(int i=0; i<numClientes;i++){
			System.out.println(clientes.get(i).toString());
		}
	}
}
