package test;

import source.ThreadExtendido;

public class testThread {
	public static void main(String []args){
		ThreadExtendido hilo1 = new ThreadExtendido();
		hilo1.start();// For executing threads use star() method, which calls to run()
		hilo1.run(); //	run() method run receives its new body with the code to execute
		
		ThreadExtendido hilo2 = new ThreadExtendido();
		hilo2.start();
		hilo2.run();
		
	}
}
