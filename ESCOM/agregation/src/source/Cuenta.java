package source;

public class Cuenta {
	private double saldo;
	public Cuenta(double saldoInicial){
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
		if(monto <= saldo && monto > 0){
			saldo -= monto;
		}
	}
}
