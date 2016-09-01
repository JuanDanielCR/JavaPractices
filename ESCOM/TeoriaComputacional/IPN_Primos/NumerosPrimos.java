package teoriaprimos;
public class NumerosPrimos {
    private int cadena_calculo;
    private boolean primo;

    public void setCadena_calculo(int cadena_calculo) {
        this.cadena_calculo = cadena_calculo;
    }

    public boolean is_primo() {
        primo = true;
        int temp;
        for(int i=2;i<=cadena_calculo/2;i++)
	{
           temp =cadena_calculo%i;
	   if(temp==0)
	   {
	      primo=false;
	      break;
	   }
	}
        return primo;
    }
    
}