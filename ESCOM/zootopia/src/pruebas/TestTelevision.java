package pruebas;

import tv.Television;

public class TestTelevision {
    //other notation (String... args)
    public static void main(String[] args) {
        Television tv; //Referencia al objeto tv
        tv = new Television(); //Inicializacion
        System.out.println(tv);
        tv.setTurnOn();
        tv.arribaCanal();
        tv.setVolUp();
        System.out.println(tv);
    }
}