package sources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {
	private AnalisisAutomata analizador;
	private BufferedReader inputStream;
	private PrintWriter outputStream, historiaStream;
	private int caracter, estado;
	
	public Archivo(String archivo_lectura, String archivo_salida, String archivo_historia){
		try {
			this.caracter = 0;
			this.inputStream = new BufferedReader(new FileReader(archivo_lectura));
			this.outputStream = new PrintWriter(new FileWriter(archivo_salida));
			this.historiaStream = new PrintWriter(new FileWriter(archivo_historia));
			this.analizador = new AnalisisAutomata();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public void analizarArchivo(){
		try{
			while((caracter = inputStream.read())!=-1){
				estado = analizador.analizarSimbolo(caracter);
				//outputStream.write(analizador.simbolo);
				historiaStream.write(formatoEstado(estado));
				if(estado == 18 ){//La palabra es web o ebay
					System.out.println(estado);
					outputStream.write("L�nea ["+analizador.numero_lineas+"] Palabra: web \n");
				}else if(estado == 146){
					outputStream.write("L�nea ["+analizador.numero_lineas+"] Palabra: ebay \n");
				}
				if(analizador.isPalabra == true || analizador.isLinea == true){
					historiaStream.write("\n");
				}
			}
			System.out.println("Num. palabras: "+analizador.numero_palabras+" Numero l�neas: "+analizador.numero_lineas+" Numero correctas: "+analizador.numero_correctas);
			closeBufferedStream();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public String formatoEstado(int estado){
		String final_estado = "q";
		final_estado += Integer.toString(estado);
		return final_estado;
	}
	
	public void closeBufferedStream(){
		try{
			if(inputStream != null){
				inputStream.close();
			}
			if(outputStream != null){
				outputStream.close();
			}
			if(historiaStream != null){
				historiaStream.close();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
