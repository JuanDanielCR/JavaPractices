  import java.util.Scanner;

public class mainBoxes{

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int continua;
    int bags;
    int modo;
    do{
      System.out.println("Bags: ");
      bags = sc.nextInt();
      order orden = new order(bags);
      System.out.println("Modo 1:Recursivo, 2:Looping");
      modo = sc.nextInt();
      if(modo == 1){
        orden.boxesReport(1);
      }else{
        orden.boxesReport(2);
      }
      System.out.println("Otra orden? Si:1");
      continua = sc.nextInt();
    }while(continua == 1);
  }
}
