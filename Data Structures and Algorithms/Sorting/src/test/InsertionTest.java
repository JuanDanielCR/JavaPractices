package test;
import sources.InsertionSorting;
public class InsertionTest {
	public static void main(){
		int data[] =  new int[100];
		for(int i=0; i<1000; i++){
			data[i] = (int)Math.random();
		}
		InsertionSorting.insertionSort(data);
		for(int i=0; i<1000; i++){
			System.out.print(data[1]+" ");
		}
	}
}
