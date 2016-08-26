import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Alphabet{
  //using static because we will call them from static main()
  private static Scanner sc;
  private static PrintWriter writer;
  private static int potencia;
  private static int potencia_final;
  private static String[] simbolos;
  private static boolean modo = false;

  public static void main(String[] args) {
    try{
      sc = new Scanner(System.in);
      writer = new PrintWriter("combinatorics.txt", "UTF-8");
    }catch (Exception e) {
      System.out.println("Error");
    }
    modo = seleccionarModo();
    if(modo == false){
      ejecutarManual();
    }else{
      ejecutarAutomatico();
    }
    writer.close();
    System.out.println("Adios!");
  }
/*MODO*/
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
     simbolos = new String[] {"0","1"};
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
    /*int alpha=0;
    simbolos = new String[2];
    while(alpha<2){
      System.out.println("Simbolo:");
      simbolos.add(sc.next().charAt(0));
      alpha++;
    }*/
    simbolos = new String[] {"0","1"};
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
    llenarSubconjunto();
    return 1;
  }

  private static int llenarSubconjunto(){
    StringBuilder combinacion = new StringBuilder("");
    //int epsilon = 222;
    //guardarCombinacion((char)epsilon); instead of char use StringBuilder
    for(int i = 0; i < potencia_final; i++){
      int aux = i+1;
      //crearCombinacionRecursiva(simbolos,aux,combinacion);
      crearCombinacionBinario(potencia_final);
    }
    return 1;
  }

  private static void crearCombinacionBinario(int potencia){
     StringBuilder binary = new StringBuilder("");
     for (int i = 0; i < Math.pow(2, potencia); i++) {
       binary.insert(0, Integer.toBinaryString(i));
       for(int j = binary.length(); j < potencia; j++) {
           binary.insert( 0, '0' );
       }
       guardarCombinacion(binary);
       System.out.print("{"+binary+"},");
       int largo_combinacion = binary.length();
       for(int k = 0; k < largo_combinacion; k++) {
         binary.deleteCharAt(0);
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
              salida.deleteCharAt(salida.length() - 1);
          }
      }
  }

  private static int guardarCombinacion(StringBuilder combinacion_individual){
    writer.print("{"+combinacion_individual +"}"+ ",");
    return 1;
  }
}
