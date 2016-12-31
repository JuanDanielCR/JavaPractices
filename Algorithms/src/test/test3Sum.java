package test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;

import source.ThreeSum;

public class test3Sum {
	public static void main(String args[]){
		int N = 8000;
		Random rdn =  new Random();
		TimeUnit units =  TimeUnit.SECONDS;
		int [] a = new int[N];
		for(int i = 0; i < N-1; i++){
			a[i] = rdn.nextInt(1000);
		}
		StopWatch watch = new StopWatch();
		watch.start();
		int b = ThreeSum.count(a);
		System.out.println("Time: "+watch.getTime(units) + " - count: "+b);
		watch.stop();
	}
}
