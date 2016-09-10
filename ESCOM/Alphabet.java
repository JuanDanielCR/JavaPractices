import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Alphabet{
  //using static because we will call them from static main()
  private static Scanner sc; //Object for input elements
  private static PrintWriter writer; //Object for writting on file
  private static int potencia_final; //Our final number of alpahbets for our universe
  private static int potencia; //Index for making each alphabet
  private static String[] simbolos;//Array which stores our symbols
  private static boolean is_automatico = false;// Manual/Automatic

  public static void main(String[] args) {
    try{
      //Uisng 0,1 as our symbols for our universe
      simbolos =  new String[]{"0","1"};
      sc = new Scanner(System.in);
      writer = new PrintWriter("combinatorics.txt", "UTF-8");
    }catch (Exception e) {
      System.out.println("Error: "+e.toString());
    }
    is_automatico = seleccionarModo();
    if(is_automatico == false){
      ejecutarManual();
    }else{
      ejecutarAutomatico();
    }
    writer.close();
    System.out.println("Adios!");
  }
  
/*MODO.- Use for selecting our executing mode*/
  private static boolean seleccionarModo(){
    int seleccion = 1;
    boolean modo=false;
    System.out.println("Manual: 1, Automatico: 2 ");
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
/*AUTOMATICO*/
  private static int ejecutarAutomatico(){
     double aleatorio = 0;
    do{
      llenarUniverso(0);
      //0.0 < aleatorio < 1.0
      aleatorio = Math.random();
    }while(aleatorio < 0.5);
    return 1;
  }
/*MANUAL*/
  private static int ejecutarManual(){
    int continuar = 1;
    do {
      llenarUniverso(1);
      System.out.println("Su resultado fue guardado en combinatorics.txt ¿Desea continuar? 1: Si, 0: No");
      continuar =  sc.nextInt();
    } while (continuar == 1);
    return 0;
  }

/*UNIVERSO*/
  private static int llenarUniverso(int tipo){
    if(tipo == 1){
      System.out.println("Elige la potencia final (1-1000): ");
      potencia_final = sc.nextInt();
    }else{
      //potencia aleatoria
      Random r = new Random();
      potencia_final = r.nextInt(1000-0)+0;
      System.out.println("Aleatorio potencia: " + potencia_final);
    }
    writer.print("{"+(char)216+"}"); //vacio
    llenarSubconjunto();
    return 1;
  }

  private static int llenarSubconjunto(){
    StringBuilder combinacion = new StringBuilder("");
    int modo_calculo=0;
    System.out.println("Modo de calculo (0)-Recursiva, (1)-Binario: ");
    modo_calculo = sc.nextInt();

      if(modo_calculo==0){
        for(int i = 0; i < potencia_final; i++){
          int aux = i+1;
          crearCombinacionRecursiva(simbolos,aux,combinacion);
        }
      }else{
        crearCombinacionBinario(potencia_final, combinacion);
      }
    return 1;
  }

  private static void crearCombinacionBinario(int potencia, StringBuilder combinacion){
    for(int potencia_actual = 1;potencia_actual<=potencia;potencia_actual++){
      for (int i = 0; i < Math.pow(2, potencia_actual); i++) {
        combinacion.insert(0, Integer.toBinaryString(i));
        for(int j = combinacion.length(); j < potencia_actual; j++) {
          combinacion.insert( 0, '0' );
        }
        guardarCombinacion(combinacion);
        //free our String Builder
        int largo_combinacion = combinacion.length();
        for(int k = 0; k < largo_combinacion; k++) {
            combinacion.deleteCharAt(0);
        }
      }
    }
  }

  private static void crearCombinacionRecursiva(String []base_simbolos, int ancho_combinatoria, StringBuilder salida) {
      if (ancho_combinatoria == 0) {
          guardarCombinacion(salida);
      } else {
          for (int i = 0; i < (base_simbolos.length); i++) {
              salida.append(base_simbolos[i]);
              crearCombinacionRecursiva(base_simbolos, ancho_combinatoria - 1, salida);
              //free StringBuilder which saves the combination
              salida.deleteCharAt(salida.length() - 1);
          }
      }
  }

  private static int guardarCombinacion(StringBuilder combinacion_individual){
    writer.print(",{"+combinacion_individual +"}");
    return 1;
  }
}
