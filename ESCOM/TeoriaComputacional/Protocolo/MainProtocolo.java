package automata.protocolo; 

import java.util.ArrayList;

public class MainProtocolo{
    public static void main(String[] args) {
        ArrayList<String> historia_protocolo = new ArrayList<>();
        ArchivosProtocolo admin_historia = new ArchivosProtocolo();
        float is_encendido=1;
        int respues_automata;
        String palabra_historia = "";
        admin_historia.crear_escritor("historia_protocolo.txt");
        AutomataProtocolo protocolo = new AutomataProtocolo();
        do{
            respues_automata=protocolo.recibirProtocolo(is_encendido);
            historia_protocolo = protocolo.historia;
            for(String estado : historia_protocolo){
                palabra_historia+=estado;
            }
            admin_historia.setElemento_escrito(palabra_historia);
            palabra_historia="";
            historia_protocolo.clear();
             is_encendido = (float) Math.random();
            System.out.println("El protocolo recibio datos");
            if(respues_automata==0){
                System.out.println("El protocolo no recibio datos");
                break;
            }
        }while(is_encendido > 0.5);
        protocolo.guardarHistoria();
        admin_historia.guardar_archivo();
        System.out.println("Historias guardadas en txt");
        System.out.println("Adios!");
    }
}