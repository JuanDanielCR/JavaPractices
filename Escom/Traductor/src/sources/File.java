package sources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class File {
    private BufferedReader inputStream = null;
    private ArrayList<String> words;
    public static File archivo =  null;
    int c;
    
    /*Singleton*/
    public static File getArchivo(String diccionario){
        if(archivo == null)
            archivo = new File(diccionario);
        return archivo;
    }
    private File(String input){
        try{
            words = new ArrayList<>();
            this.c =0;
            inputStream = new BufferedReader(new FileReader(input));		
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
	
    public ArrayList cargarPalabras(){
        String palabra_leida = "";
        try{
            while((palabra_leida = inputStream.readLine()) != null){
                words.add(palabra_leida);
            }
        }catch(IOException e ){
            e.printStackTrace();
        }
        return words;
    }
	
    public void closeBufferedStream(){
        try{
            if(inputStream != null){
                inputStream.close();
            }	
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
