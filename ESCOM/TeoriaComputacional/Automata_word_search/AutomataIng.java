package automata.ing;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AutomataIng {
     
    public static void main(String[] args) throws FileNotFoundException, IOException{
       Archivos archivo_lectura = new Archivos("archivos/dony.txt"); 
       archivo_lectura.leer_archivo();
    }   
}