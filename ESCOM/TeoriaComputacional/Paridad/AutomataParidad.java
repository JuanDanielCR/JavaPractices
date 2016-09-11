package automata.paridad;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AutomataParidad {

    public static void main(String[] args) {
        Automata paridor = new Automata();
        Archivos archivo_manual_lector = new Archivos();
        Archivos archivo_manual_escritor = new Archivos();
        Archivos archivo_automatico_escritor = new Archivos();
        ArrayList<String> automatico;
        boolean resultado;
        double continuar_automatico;
        double continuar_cadena_size;
        double continuar_cadena_automatica;
        int continuar;
        int continuar_cadena;
        int continuar_archivo;
        int continuar_manual;
        int modo;
        int modo_manual;
        int modo_automatico;
        int indice_vuelta_manual=0;
        int indice_vuelta_auto=0;
        int size_usuario;
        String cadena;
        String nombre_archivo;
        Scanner sc = new Scanner(System.in);
        //Creando archivos escritores fuera
        archivo_manual_escritor.crear_escritor("output_manual_file.txt");
        archivo_automatico_escritor.crear_escritor("output_auto_file.txt");
        do {    
            System.out.println("Automata Paridad");
            System.out.println("Manual: 1, Automatico: 2 ");
            System.out.println("Elige:");
            modo = sc.nextInt();
            if(modo > 1){
                //Automatico
                do {            
                    System.out.println("Desea ingresar el ancho de la cadena? Si: 1, No :0 ");
                    System.out.println("Elige:");
                    modo_automatico = sc.nextInt();
                    indice_vuelta_auto++;
                     archivo_automatico_escritor.setElemento_escrito(
                                        "Iteracion: "+Integer.toString(indice_vuelta_auto));
                    if(modo_automatico > 0.5){
                        //size dado por el usuario
                        System.out.println("Ingresa el ancho de tu cadena: ");
                        size_usuario = sc.nextInt();
                        do {
                            cadena = generaDataAleatoriaSize(size_usuario);
                            System.out.println(cadena);
                            resultado = paridor.calcularParidad(cadena);
                            if(resultado == true){
                                archivo_automatico_escritor.setElemento_escrito(cadena +" Paridad");
                            }else{
                                archivo_automatico_escritor.setElemento_escrito(cadena +" No Paridad");
                            }
                            continuar_cadena_size = Math.random();
                        } while (continuar_cadena_size > 0.5);
                    }else{
                        //size aleatorio
                        do {
                            cadena = generarDataAleatoria();
                            System.out.println(cadena);
                            resultado = paridor.calcularParidad(cadena);
                            if(resultado == true){
                                archivo_automatico_escritor.setElemento_escrito(cadena +" Paridad");
                            }else{
                                archivo_automatico_escritor.setElemento_escrito(cadena +" No Paridad");
                            }
                            continuar_cadena_automatica = Math.random();
                        } while (continuar_cadena_automatica > 0.5);
                    }
                    continuar_automatico = Math.random();
                } while (continuar_automatico > 0.5);
            }else{
                //Manual
                do {    
                    System.out.println("Ingresar cadena: 1, Selecciona archivo: 2 ");
                    System.out.println("Elige:");
                    modo_manual = sc.nextInt();
                    if(modo_manual > 1){
                        //Ingresar nombre archivo
                        do {
                            indice_vuelta_manual++;
                            boolean paridad_archivo;
                            System.out.println("Ingresa el nombre de tu archivo:");
                            nombre_archivo =sc.next();
                            try{
                                //Leyendo info
                                archivo_manual_lector.crear_lector(nombre_archivo);
                                archivo_manual_lector.leer_elementos();
                                automatico = archivo_manual_lector.getLineas_leidas();
                                //Calculando paridad y escribiendo el resultado
                                archivo_manual_escritor.setElemento_escrito(
                                        "Iteracion: "+Integer.toString(indice_vuelta_manual));
                                for(String linea_leida : automatico){
                                    paridad_archivo = paridor.calcularParidad(linea_leida);
                                    //Guardando los pares
                                    if(paridad_archivo==true){
                                        archivo_manual_escritor.setElemento_escrito(linea_leida);
                                    }
                                }
                            }catch(Exception e){
                                System.out.println(e.toString());
                            }
                            System.out.println("Desea ingresar otro archivo? Si: 1, No :0");
                            continuar_archivo = sc.nextInt();
                        } while (continuar_archivo > 0);
                    }else{
                        //Ingresar cadena
                        do {   
                            System.out.println("Ingresa tu cadena 0,1:");
                            cadena=sc.next();
                            resultado = paridor.calcularParidad(cadena);
                            if(resultado == true){
                                System.out.println("Paridad");
                            }else{
                                System.out.println("No paridad");
                            }
                            System.out.println("Desea ingresar otra cadena? Si: 1, No :0");
                            continuar_cadena = sc.nextInt();
                        } while (continuar_cadena > 0);
                    }
                    System.out.println("Desea seguir en modo manual? Si: 1, No :0");
                    continuar_manual = sc.nextInt();
                }while (continuar_manual > 0);
            }
            System.out.println("Desea continuar con el programa? 1: Si, 0: No");
            continuar = sc.nextInt();
        } while (continuar>0);
        archivo_manual_escritor.guardar_archivo();
        archivo_automatico_escritor.guardar_archivo();
        System.out.println("Adios!");
    }
    
    public static String generarDataAleatoria(){
        Random r = new Random();
        int potencia_final = r.nextInt(1000-0)+0;
        return generaDataAleatoriaSize(potencia_final);
    }
    public static String generaDataAleatoriaSize(int size){
        String data_aleatoria="";
        float caracter;
        for(int i=0; i<size;i++){
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