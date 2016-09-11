package automata.protocolo;

import java.util.ArrayList;

public class AutomataProt {
    private AutomataPar automata_paridad;
    private Archivos admin_archivos;
    private Archivos admin_archivos2;
    private String palabra;
    private ArrayList<String> lineas_leidas;
    private int estado;
    private boolean estado_paridad;
    public AutomataProt(){
        automata_paridad = new AutomataPar();
    }
    public int recibirProtocolo(float is_encendido){
        //No se reciben datos
        if(is_encendido < 0.5){
            estado = 0;
            return estado;
        }else{
            try{
            //Escritura de datos, modo aleatorio
            estado = 1;
            admin_archivos = new Archivos();
            admin_archivos.crear_escritor("data.txt");
            for(int i=0; i<50;i++){
                palabra = crearDatos();
                admin_archivos.setElemento_escrito(palabra);  
            }
            admin_archivos.guardar_archivo();
            try {
                //1 segundo
                    Thread.sleep(1000);
                    estado=2;
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                //Escritor paridad
                admin_archivos2 = new Archivos();
                admin_archivos2.crear_escritor("paridad.txt");
                //Lector
                admin_archivos.crear_lector("data.txt");
                admin_archivos.leer_elementos();
                }catch(Exception e){
                estado = 0;
                System.out.println("Error: "+e.toString());
            }
            
            lineas_leidas = admin_archivos.getLineas_leidas();
            automata_paridad = new AutomataPar();
            for(String palabra_leida : lineas_leidas){
                estado_paridad = automata_paridad.calcularParidad(palabra_leida);
                if(estado_paridad == true){
                    admin_archivos2.setElemento_escrito(palabra_leida);
                }
            }
            admin_archivos2.guardar_archivo();
            estado = 3;
        }
        return estado;
    }
    public String crearDatos(){
        String data_aleatoria="";
        float caracter;
        for(int i=0; i<16;i++){
            caracter = (float) Math.random();
            if(caracter < 0.5){
                data_aleatoria += "0";
            }else{
                data_aleatoria += "1";
            }
        }
        return data_aleatoria;
    }
}