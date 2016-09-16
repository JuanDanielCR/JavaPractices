public class order{
  public int bags;
  private int largeBox;
  private int mediumBox;
  private int smallBox;
  private double totalCosto;
  private long startTime;
  private long endTime;
  private long duration;

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
    startTime = 0;
    endTime = 0;
    duration = 0;
  }
  
  public void boxesReport(int tipo){
    if(tipo == 1){
      startTime = System.nanoTime();
      dividirBoxes(bags);
      endTime= System.nanoTime();
      duration = (endTime - startTime);
      System.out.println("--------------Duration Recursiva: "+duration+"-----------------");
      totalCosto();
      mostrarCosto();
    }else{
      startTime = System.nanoTime();
      dividirBoxesSimple(bags);
      endTime= System.nanoTime();
      duration = (endTime - startTime);
      System.out.println("--------------Duration Simple: "+duration+"-----------------");
      totalCosto();
      mostrarCosto();
    }
  }

  private void mostrarCosto(){
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

  private void dividirBoxesSimple(int bags){
    while(bags > 0){
      if(bags >= L_CAPACITY){
      largeBox = (largeBox + bags/20);
        bags = bags%20;
      }else if(bags >= M_CAPACITY){
        //For the lowest number of boxes and minimum size, check when the price of the lower size boxex equals to a superior
          if(bags > M_CAPACITY+S_CAPACITY){
            largeBox++;
            bags = 0;
          }else{
            mediumBox = (mediumBox + bags/10);
            bags = bags%10;
          }
      }else if(bags >= S_CAPACITY){
         if(bags > S_CAPACITY){
            mediumBox++;
            bags = 0;
          }else{
            smallBox = (smallBox + bags/5);
            bags =  bags % 5;
          }
      }else if(bags != 0){
        smallBox++;
        bags = 0;
      }
    }
  }

}