package test;

import java.util.Random;
import java.util.Scanner;

import sources.Archivo;
import sources.Palindromo;

public class TestPalidromos {
	public static void main(String args[]){
		int flujo = 1;
		Random rdn = new Random();
		Scanner sc = new Scanner(System.in);
		Archivo archivo = Archivo.getSingleton("palindromos.txt");
		try{
			do{
				System.out.println("¿Usar recursion? 1-Si | 0-No");
				int answer = Integer.parseInt(sc.next());
				int random_length = rdn.nextInt(1000);
				Palindromo pal =  new Palindromo(random_length,answer);
				flujo = rdn.nextInt(2);
				archivo.escribirPalindromos(pal.getPalindromo().toString());
				System.out.println(":"+random_length);
			}while(flujo != 0);
		}catch(Exception e){
			System.out.println(e.toString());
		}
		archivo.closeBufferedStream();
		sc.close();
	}
}
