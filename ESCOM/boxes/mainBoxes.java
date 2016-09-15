  import java.util.Scanner;

public class mainBoxes{

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int continua;
    int bags;
    do{
      System.out.println("Bags");
      bags = sc.nextInt();
      order orden = new order(bags);
      orden.boxesReport();
      System.out.println("Otra orden? Si:1");
      continua = sc.nextInt();
    }while(continua == 1);
  }
}
