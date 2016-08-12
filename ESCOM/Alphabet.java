import java.io.*;
import java.util.Scanner;
public class Alphabet{
  //using static because we will call them from static main()
  private static Scanner sc;
  private static int potencia;
  private static int potencia_final;
  private static String[] simbolos = {"0","1"};
  private static boolean random = false;

  public static void main(String[] args) {
    try{
      sc = new Scanner(System.in);
    }catch (Exception e) {
      System.out.println("Error con escaner");
    }
    random = seleccionarModo();
    if(random == false){
      ejecutarManual();
    }else{
      ejecutarAutomatico();
    }
  }

  private static int ejecutarAutomatico(){

    return 1;
  }

  private static int ejecutarManual(){
    int continuar = 1;
    llenarUniverso();
    do {

      System.out.println("¿Desea continuar? 1: Si, 0: No");
      continuar =  sc.nextInt();
    } while (continuar == 1);
    return 0;
  }

  private static boolean seleccionarModo(){
    int seleccion = 1;
    boolean modo=false;
    System.out.println("Manual: 1, Automático: 2 ");
    System.out.println("Elige:");
    seleccion = sc.nextInt();
    if(seleccion == 1){
      modo = false;
      System.out.println("Manual Activado");
    }else if (seleccion == 2) {
      modo = true;
      System.out.println("Automatico Activado");
    }else{
      System.out.println("Manual Activado");
    }
    return modo;
  }

  private static int llenarUniverso(){
    //llama a llenarSubconjunto()
    System.out.println("Elige la potencia final (1-1000): ");
    potencia_final = sc.nextInt();
    //recorrer los subconjuntos
    for(int potencia = 0; potencia<potencia_final; potencia++){
      llenarSubconjunto(potencia);
    }
    return 1;
  }
  private static int llenarSubconjunto(int potencia_actual){
    //llamado a crearCombinacion
    String combinacion;
    String aux;
    //for() para recorrer las combinaciones
    for(int i = 0; i<=Math.pow(2,potencia_actual);i++){
      //for() para concatenar y crear la combinacion, ira poniendo caracter por caracter
      //potencia_actual = cardinalidad de cada combinacion
      combinacion="";
      while(combinacion.length()<potencia_actual){
        //aqui se llena la combinacion
        combinacion += simbolos[0];
      }
      guardarCombinacion(combinacion);
    }
    return 1;
  }
  private static int guardarCombinacion(String combinacion_individual){
    //Guardar combinacion en un archivo
    return 1;
  }
}
