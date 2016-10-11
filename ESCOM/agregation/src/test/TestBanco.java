package test;
import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import source.*;
public class TestBanco {
	public static void main(String []args){
		Banco banco = new Banco();
		Cuenta c = new Cuenta(20000);
		Cuenta c_ahorro = new CuentaDeAhorros(30000, 2);
		CuentaDeCheques c_cheques = new CuentaDeCheques(40000);
		Cliente cli= new Cliente("Juan Daniel");
		Cliente cli2 = new Cliente("Adriana");
		Cliente cli3 = new Cliente("Samuel");
		
		//Banco
		banco.agregaCliente(cli);
		banco.agregaCliente(cli2);
		banco.agregaCliente(cli3);
		System.out.println(banco.obtenerCliente(0));
		System.out.println(banco.obtenerNumCliente());
		
		//Cuenta Ahorro
		System.out.println("Saldo C: "+c.consultar());
		c.depositar(100000);
		System.out.println("Saldo C: "+c.consultar());
		c.retirar(10000);
		System.out.println("Saldo C: "+c.consultar());
		
		//Cuenta Cheque
		System.out.println("Saldo Cheques: "+c_cheques.consultar());
		System.out.println("Saldo Cheques: "+c_cheques.obtenerMontoSobregiro());
		c_cheques.retirar(40000);
		System.out.println("Saldo Cheques: "+c_cheques.consultar());
		c_cheques.retirar(8000);
		System.out.println("Saldo Cheques: "+c_cheques.consultar());
		c_cheques.retirar(100000);
		(CuentaDeCheques)c_cheques;
		//Clientes
		cli.establecerCuenta(c);
		cli2.establecerCuenta(c_ahorro);
		cli3.establecerCuenta(c_cheques);
		
		banco.imprimirClientes();
		
	}
}
