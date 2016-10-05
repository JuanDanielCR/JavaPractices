package source;

public class CuentaDeCheques extends Cuenta{
	private double montoSobregiro;
	
	public CuentaDeCheques(double saldoIni, double sobregiro){
		super(saldoIni);
		this.montoSobregiro = sobregiro;
	}
	public CuentaDeCheques(double saldoIni){
			super(saldoIni);
	}
	@Override
	public void retirar(double monto){
		if( monto > 0){
			if(monto <= saldo){
				saldo -= monto;
			}else{
				montoSobregiro = monto - saldo;
				saldo = 0;
			}
		}
	}
}
