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
		Cuenta cuenta = new Cuenta(0);
		cli.establecerCuenta(cuenta);
		
		clientes.add(cli);
		numClientes++;
	}
	public int obtenerNumCliente(){
		return numClientes;
	}
	public Cliente obtenerCliente(int indice){
		if(indice >= 0 && indice < clientes.size()){
			return clientes.get(indice);
		}
		return null;
	}
	public void imprimirClientes(){
		for(int i=0; i<numClientes;i++){
			System.out.println("Nombre: "+clientes.get(i).obtenerNombre());
			System.out.println("Cuenta: "+clientes.get(i).obtenerCuenta());
			System.out.println("Saldo: "+clientes.get(i).obtenerCuenta().consultar());
		}
	}
}
