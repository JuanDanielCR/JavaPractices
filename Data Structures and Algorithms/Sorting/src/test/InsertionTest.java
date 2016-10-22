package test;
import sources.InsertionSorting;
public class InsertionTest {
	public static void main(String args[]){
		int data[] =  new int[1000];
		for(int i=0; i<1000; i++){
			int aux = (int)(Math.random()*10);
			data[i] = aux;
			System.out.print(aux);
		}
		System.out.println(" ");
		InsertionSorting.insertionSort(data);
		for(int i=0; i<1000; i++){
			System.out.print(data[i]);
		}
	}
}
