package test;
import resources.Army;
import resources.Robot;

public class TestArmy {
    public static void main(String[] args) {
        Army myArmy = new Army("Legion XIX");

        for(int i=0; i<5; i++){
            Robot robot =  new Robot(i, "X"+i, 200, true);
            myArmy.agregarRobot(robot);
        }
                
        System.out.println("myArmy = "+myArmy);
            
        myArmy.quitarRobot();
            myArmy.quitarRobot();
            myArmy.quitarRobot();
            myArmy.quitarRobot();
            myArmy.quitarRobot();
            
        System.out.println("myArmy = "+myArmy);
    }
}