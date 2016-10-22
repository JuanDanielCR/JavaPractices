package resources;

public class Army {
    private Robot[] army;
    private String name;
    private int index;

    public Army(String name) {
        //Initialized at null when creating an array of a class
        this.army = new Robot[5];
        //Stacks are initialized on 
        this.name = name;
        //
        this.index=-1;
    }

    @Override
    public String toString() {
        String temp = "ARMY = { name: "+name+" robots: ";
        for (Robot army1 : army) {
            if(army1!=null){
                temp += army1;
            }
        }
        temp += "}";
        return temp;
    }
    
    public boolean agregarRobot(Robot un_robot){
        if(index<army.length){
            this.army[++index]= un_robot;
           return true;                   
        }
        else{
            System.out.println("Ejercito lleno");
        }
        return false;
    }
    
    public boolean quitarRobot(){
        if(index>=0){
            this.army[index--] = null;
            return true;
        }
        else{
            System.out.println("Ejercito vacio");
        }
        return false;
    }
    
        public boolean quitarRobot(int indice_borrado){
        if(indice_borrado>=0 & indice_borrado<army.length){
            this.army[index--] = null;
            return true;
        }
        else{
            System.out.println("Ejercito vacio o fuera del rango");
        }
        return false;
    }
}