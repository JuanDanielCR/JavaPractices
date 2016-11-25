package sources;

import java.util.Random;

/**
 * Terminales {0,1,""}
 * Variables {s}
 * s-> 0s0 | 1s1 | 0 | 1 | ""
 * **/
public class Palindromo {
	private StringBuilder s = new StringBuilder("");
	private int longitud = 0;
	private int i = 0;
	private int flag = 0;
	private int flag_intermedio = 0;
	private int isRecursive = 0;
	 
	private Random rdn = new Random();
	
	public Palindromo(int longitud, int r){
		this.longitud = longitud/2;
		flag_intermedio = longitud % 2;
		isRecursive = r;
		s.append("").append(" ").append("");
	}
	public StringBuilder getPalindromo(){
		if(isRecursive == 0){
			generarSinRecursion();
		}else{
			generarPalindromo();
		}
		if(flag_intermedio != 0){//Impar
			s.replace(i,i+1,Integer.toString(rdn.nextInt(2))); //0 o 1
		}else{
			s.replace(i,i+1,"");//Palabra vacía
		}
		return s;
	}
	private void generarPalindromo(){
		while(longitud>0){
			longitud--;
			flag = rdn.nextInt(2);
			if(flag == 0){
				s.insert(i, "0");
				s.insert(i+2,"0");
			}else{
				s.insert(i, "1");
				s.insert(i+2,"1");
			}
			i++;
			generarPalindromo();
		}
	}
	private void generarSinRecursion(){
		for(int j = 0; j < longitud; j++){
			flag = rdn.nextInt(2);
			if(flag == 0){
				s.insert(i, "0");
				s.insert(i+2,"0");
			}else{
				s.insert(i, "1");
				s.insert(i+2,"1");
			}
			i++;
		}
	}
}
