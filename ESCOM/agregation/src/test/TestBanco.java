package test;
import source.*;
public class TestBanco {
	public static void main(String []args){
		Banco banco = new Banco();
		banco.agregaCliente("Juan Daniel", "2016630055");
		banco.agregaCliente("Adriana", "2016630490");
		System.out.println(banco.obtenerCliente(0));
		System.out.println(banco.obtenerNumCliente());
		banco.imprimirClientes();
	}
}
