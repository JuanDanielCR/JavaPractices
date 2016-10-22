package resources;

public class Robot {
    private int id;
    private String name;
    private double weight;
    private boolean attackMode;

    public Robot(int id, String name, double weight, boolean attackMode) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.attackMode = attackMode;
    }

    @Override
    public String toString() {
        return "Robot{" + "id=" + id + ", name=" + name + ", weight=" + weight + ", attackMode=" + attackMode + '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isAttackMode() {
        return attackMode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAttackMode(boolean attackMode) {
        this.attackMode = attackMode;
    }
    
    
}