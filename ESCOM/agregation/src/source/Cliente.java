package source;

public class Cliente {
	private double saldo;
	public Cliente(double saldoInicial){
		this.saldo = saldoInicial;
	}
	public double consultar(){
		return saldo;
	}
	public void depositar(double monto){
		if(monto>0){
			saldo += monto;
		}
	}
	public void retirar(double monto){
		if(monto <= saldo){
			saldo -= monto;
		}
	}
}
