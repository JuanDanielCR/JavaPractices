package test;
import source.*;
public class TestBanco {
	public static void main(String []args){
		Banco banco = new Banco();
		Cuenta c = new Cuenta(20000);
		//Upcasting
		Cuenta c_ahorro = (Cuenta)new CuentaDeAhorros(30000, 2); //(Cuenta) this is optional
		Cuenta c_cheques = new CuentaDeCheques(40000);
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
		//Downcasting using instance of feature
		if(c_cheques instanceof CuentaDeCheques){
			CuentaDeCheques copy_pointer = (CuentaDeCheques)c_cheques;
			System.out.println("Saldo Cheques Pointer: "+copy_pointer.obtenerMontoSobregiro());
		}
		c_cheques.retirar(40000);
		System.out.println("Saldo Cheques: "+c_cheques.consultar());
		c_cheques.retirar(8000);
		System.out.println("Saldo Cheques: "+c_cheques.consultar());
		c_cheques.retirar(100000);

		//Clientes
		cli.establecerCuenta(c);
		cli2.establecerCuenta(c_ahorro);
		cli3.establecerCuenta(c_cheques);
		
		banco.imprimirClientes();
		
	}
}
