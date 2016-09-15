public class order{
  public int bags;
  private int largeBox;
  private int mediumBox;
  private int smallBox;
  private double totalCosto;

  private final static double BAG_COST = 5.50;
  private final static double L_BOX_COST = 2.0;
  private final static double M_BOX_COS = 1.0;
  private final static double S_BOX_COST=0.5;
  
  private final static double L_CAPACITY = 20;
  private final static double M_CAPACITY = 10;
  private final static double S_CAPACITY = 5;


  public order(int bags){
    this.bags = bags;
    largeBox = 0;
    mediumBox = 0;
    smallBox = 0;
  }
  
  public void boxesReport(){ 
    dividirBoxes(bags);
    totalCosto();
    System.out.println("Number of Bags Ordered : "+bags+" - $"+bags*BAG_COST);
    System.out.println("Boxes Used:");
    System.out.println("Large: "+largeBox+" Medium : "+mediumBox+" Small: "+smallBox);
    System.out.println("Your total cost is: $"+totalCosto);
  }

  private void totalCosto(){
    totalCosto += largeBox*L_BOX_COST;
    totalCosto += mediumBox*M_BOX_COS;
    totalCosto += smallBox*S_BOX_COST;
    totalCosto += bags*BAG_COST;
  }

  private void dividirBoxes(int bags){
    if(bags >= L_CAPACITY){
      largeBox = (largeBox + bags/20);
        if( bags%20 > 0)
          dividirBoxes(bags % 20);
    }else if(bags >= M_CAPACITY){
      //For the lowest number of boxes and minimum size, check when the price of the lower size boxex equals to a superior
        if(bags > M_CAPACITY+S_CAPACITY){
          largeBox++;
        }else{
          mediumBox = (mediumBox + bags/10);
          if( bags%10 > 0)
           dividirBoxes(bags % 10);
        }
    }else if(bags >= S_CAPACITY){
       if(bags > S_CAPACITY){
          mediumBox++;
        }else{
          smallBox = (smallBox + bags/5);
          if( bags%5 > 0)
            dividirBoxes(bags % 5);
        }
    }else if(bags != 0){
      smallBox++;
    }
  }

}
