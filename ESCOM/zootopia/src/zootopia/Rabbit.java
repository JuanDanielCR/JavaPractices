package zootopia;

public class Rabbit {
    public String name;
    int speed;
    
    public Rabbit(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Rabbit{" + "name=" + name + ", speed=" + speed + '}';
    }
    
}
