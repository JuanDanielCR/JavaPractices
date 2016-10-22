package test;
import resources.Robot;
public class Test {
    public static void main(String[] args) {
        Robot myRobot =  new Robot(1,"Robot1",120.50,false);
        
        System.out.println("Name: "+myRobot.getName());
        System.out.println("Id: "+myRobot.getId());
        System.out.println("Weight: "+myRobot.getWeight());
        System.out.println("Attack: "+myRobot.isAttackMode());
        
        myRobot.setName("Robot2");
        myRobot.setWeight(200);
        myRobot.setAttackMode(true);
        
        System.out.println("myRobot="+myRobot.toString());
        
        
    }
}