package test;
import java.util.Random;

import sources.InsertionSorting;
public class InsertionTest {
	public static void main(String args[]){
		int data[] =  new int[1000];
		
		Random rand = new Random( ); // a pseudo-random number generator
		rand.setSeed(System.currentTimeMillis( ));
		
		for(int i=0; i<1000; i++){
			int aux = rand.nextInt(100);
			data[i] = aux;
			System.out.print(aux);
		}
		
		System.out.println(" ");
		
		InsertionSorting.insertionSort(data);
		for(int i=0; i<1000; i++){
			System.out.print(data[i]); 
		}
		
		String h = "hola";
		char c[] = h.toCharArray();
		
		for(int i=0; i<c.length; i++){
			System.out.print(c[i]); 
		}
	}
}
