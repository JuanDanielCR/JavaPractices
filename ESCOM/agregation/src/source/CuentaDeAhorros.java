package source;

public class CuentaDeAhorros extends Cuenta{
	private double tasaDeInteres;
	
	public CuentaDeAhorros(double saldoIni, double tasaInteres){
		super(saldoIni);
		this.tasaDeInteres = tasaInteres;
	}
	
	@Override
	public double consultar(){
		return saldo+(saldo * tasaDeInteres/100);
	}
}
