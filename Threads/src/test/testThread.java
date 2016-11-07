package test;

import source.ThreadExtendido;
import source.ThreadRunnable;

public class testThread {
	public static void main(String []args){
		/**Test with extends Thread*/
		ThreadExtendido hilo1 = new ThreadExtendido();
		ThreadExtendido hilo2 = new ThreadExtendido();
		ThreadExtendido hilo3 = new ThreadExtendido();
		
		/**Test whit Runnable*/
		ThreadRunnable hilo4 = new ThreadRunnable();
		Thread containerRunnable = new Thread(hilo4); //Thread constructor which receives a runnable method
		
		/**Test whit Runnable and anonymous class*/
		Thread anonyThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<3; i++)
					System.out.println(Thread.currentThread().getName()+" anony");
			}
		});
		
		/**Execution of our threads*/
		/*Start vs run(), a call to start() creates another thread using concurrency, 
		 *if we just call to run() the process will be sequentially in the main Thread,
		 *so call to start() please!*/
		
		System.out.println("Call to run()");
		hilo1.run(); //	run() method run receives its new body with the code to execute
		
		System.out.println("Call to start()");
		hilo2.start(); // For executing threads use star() method, which internally calls to run()
		hilo3.start();
		
		anonyThread.start();
		
		/**Priority*/
		/*JVM chooses in which order to execute our CONCURRENT thread running,
		 * with a priority we can suggest which thread will be executed first,
		 * priority range 1-10*/
		containerRunnable.setPriority(Thread.MAX_PRIORITY); 
		containerRunnable.start();
		
	}
}
