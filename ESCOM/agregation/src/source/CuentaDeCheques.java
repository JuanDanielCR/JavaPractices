package source;

public class CuentaDeCheques extends Cuenta{
	private double montoSobregiro;
	
	public CuentaDeCheques(double saldoIni, double sobregiro){
		super(saldoIni);
		this.montoSobregiro = sobregiro;
	}
	public CuentaDeCheques(double saldoIni){
			super(saldoIni);
			this.montoSobregiro = 10000;
	}
	public double obtenerMontoSobregiro(){
		return montoSobregiro;
	}
	@Override
	public void retirar(double monto){
		if( monto > 0){
			double aux = saldo-monto;
			if(Math.abs(aux)<=montoSobregiro){
				saldo-=monto;
			}else{
				System.out.println("Monto de sobregiro excedido");
			}
		}
	}
}
