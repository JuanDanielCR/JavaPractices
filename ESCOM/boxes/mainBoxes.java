import java.util.Scanner;

public class mainBoxes{

  public static void main(String args[]){
    boolean dateFormat = false;
    boolean dateValue = false;
    int continua;
    int bags;
    int modo;
    Scanner sc = new Scanner(System.in);
    String date;
    do{
      System.out.println("Bags: ");
      bags = sc.nextInt();
      order orden = new order(bags);
      //Date Format
      do{
        System.out.println("Fecha order: ");
        date = sc.next();
        dateFormat = orden.setDateFormatFilter(date);
        System.out.println("Correct Format: "+dateFormat);
        if(dateFormat == true){
          dateValue = orden.setDateValueFilter(date);
          System.out.println("Correct Range "+dateValue);
        }
      }while(dateFormat == false || dateValue == false);
      
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
