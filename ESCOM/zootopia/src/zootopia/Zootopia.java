package zootopia;
public class Zootopia {

    public static void main(String[] args) {
        Rabbit r = new Rabbit("Daniel",19);
        System.out.println(r.toString());
        
        Sloth s = new Sloth();
        s.setName("Flash");
        s.speed = 1;
        System.out.println("Nombre Sloth: "+s.getName()+"speed: "+s.speed);
    }
    
}
