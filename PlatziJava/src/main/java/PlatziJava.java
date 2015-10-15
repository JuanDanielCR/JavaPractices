
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario Osorio
 */
public class PlatziJava {
    public static void main (String args[]){
        //Estacionamiento
        int next=1;
        ArrayList<Lugar> lugaresArreglo= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre de tu Estacinamiento: ");
        String name=scanner.nextLine();
        Estacionamiento est= new Estacionamiento(name);
        System.out.println("Ingresa el numero de Lugares: ");
        Integer lugares=scanner.nextInt();
        for(int i=0; i<lugares; i++){         
            lugaresArreglo.add(new Lugar((short)0, String.valueOf(i+1)));
        }
        System.out.println("Comprobación");
        System.out.println("Nombre: "+name);
        for(Lugar l:lugaresArreglo){
            System.out.println(l.getLocalizacion());
        }
        
        est.setLugares(lugaresArreglo);
        do{
            
            
            System.out.println("Continuar - 1 \n Salir - 0");
            next=scanner.nextInt();
        }while(next!=0);
    }
}