/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;
import java.util.ArrayList;

public class Traductor {
    private String traduccion = "Not found";
    private File archivo;
    private ArrayList<String> words;
    
    public Traductor(){
        archivo = File.getArchivo("diccionario.txt");
        words = archivo.cargarPalabras();
        
    }
    public String getTraduccion(String palabra){
        traduccion = "Not found";
        for(int i = 0; i< words.size(); i++){
             System.out.println(words.get(i));
            if(words.get(i).equals(palabra)){
                // i - par: palabra español
               
                if(i%2==0){ //par
                    traduccion = words.get(i+1);
                    break;
                }else{
                    traduccion = words.get(i-1);
                    break;
                }
            }
        }       
        return traduccion;
    }
}
