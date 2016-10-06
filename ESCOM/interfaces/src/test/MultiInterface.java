package test;
import sources.*;
public class MultiInterface {
	public static void main(String args[]){
		Photograph ph = new Photograph("id", "nombre", "fecha", 10);
		System.out.println(ph.listPrice());
	}
}
