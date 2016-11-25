package sources;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Scanning {
	private Scanner input = null;
	//Composition
	private Combinaciones automata;
	
	public Scanning(){
		input = new Scanner(System.in);
		input.useLocale(Locale.US);
		automata = new Combinaciones();
	}
	
	public void getCharacter(){
		char caracter,limit;
		limit = System.lineSeparator().charAt(0);
		System.out.println("Ingresa:");
		Pattern p = Pattern.compile(".*?", Pattern.MULTILINE);
		input.useDelimiter(p);
		while(input.hasNext()){
			caracter = input.next().charAt(0);
			if(caracter==limit){
				break;
			}
			/*Calling automaton, sending each character*/
			automata.c = caracter;
			automata.ejecutar();
			System.out.println("Camino Terminado!");
		}
		automata.mostrar();
		automata.cerrarArchivo();
	}
	
}
