package test;
import sources.*;
public class Launch {
	public static void main(String args[]){
		Archivo a = new Archivo("ebay.txt", "salida.txt", "historia.txt");
		a.analizarArchivo();
	}
}
