package sources;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Archivo {
	
	private static Archivo file_singleton = null;
	private PrintWriter outputStream;
	
	/*Begin Singleton*/
	private Archivo(String archivo_salida){
		try {
			this.outputStream = new PrintWriter(new FileWriter(archivo_salida));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static Archivo getSingleton(String salida){
		if(file_singleton == null){
			file_singleton = new Archivo(salida);
		}
		return file_singleton;
	}
	/*End Singleton*/
	
	public void escribirPalindromos(String pal){
		outputStream.write(pal+"\n");
	}
	
	public void closeBufferedStream(){
		if(outputStream != null){
			outputStream.close();
		}
	}
}
