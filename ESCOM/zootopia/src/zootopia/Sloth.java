package zootopia;

public class Sloth {
    private String name;
    public int speed;

    public Sloth() {
        this.name = "";
        this.speed = 0;
    }
    @Override
    public String toString() {
        return "Sloth{" + "name=" + name + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
