package automata.ing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.charset.Charset;

public class Archivos {
   
    private Charset encoding;
    private InputStream input;
    private Reader reader;
    private String palabra;
    private boolean automata_result;
    private int linea;
    private int indice_linea;
    private int index;
    private PrintWriter writer;
    
    public Archivos(String file) throws FileNotFoundException{
        //utf-8
        encoding = Charset.defaultCharset();
        input = new FileInputStream(file);
        reader = new InputStreamReader(input, encoding);
        writer = new PrintWriter("output.txt");
        palabra = "";
        indice_linea = 1;
        linea = 0;
        index =0;
    }
    
    public void leer_archivo() throws FileNotFoundException, IOException{ 
        Automata automata_ending = new Automata();
        int caracter_leido;
        while ((caracter_leido = reader.read()) != -1) {
            char caracter_final = (char) caracter_leido;
            
            if (caracter_leido == '\uFEFF'){
                    continue;
               }
            if(caracter_leido != 32 && caracter_leido != 13){
                palabra += caracter_final;
            }else{
                if(caracter_leido == 13){
                    linea++;
                }
                indice_linea++;
                automata_result=automata_ending.automataAnalisis(palabra+' ');
                if(automata_result == true){
                    index++;
                    //Palabra intermedia
                    if(caracter_leido==32){
                        escribir_resultado("["+index+"]"+palabra+", linea: "+(linea+1)+", numero palabra: "+(indice_linea-palabra.length()));
                        //Palabra al final
                    }else{
                        escribir_resultado("["+index+"]"+palabra+", linea: "+(linea)+", numero palabra: "+(indice_linea));  
                    }
                }
                //Borrando la palabra
                palabra = "";
                //Reiniciando el contador de la palabra
            }                
        }
        //Last word in a file
        automata_result=automata_ending.automataAnalisis(palabra+' ');;
        reader.close();
        writer.close();
    }
    private void escribir_resultado(String palabra_escrita){
        writer.write(palabra_escrita+"");
        writer.write(System.getProperty("line.separator"));
    }
}