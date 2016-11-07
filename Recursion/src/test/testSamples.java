package test;

import java.math.BigDecimal;
import java.math.BigInteger;

import source.BinarySearch;
import source.BufferedStreams;
import source.Factorial;

public class testSamples {
	public static void main(String args[]){
		//factorial(); method for testing factorial class
		binary();
	}
	
	//Testing factorial
	public static void factorial(){
		System.out.println(Factorial.calculateFactorial(12));
		
		//Testing bigInteger factorial
		BigInteger n = new BigInteger("20");
		BigInteger result = Factorial.bigFactorial(n);
		System.out.println(result.longValue());
		
		//Testing for BigDecimal, using an StringBuilder and a file, the stack of recursion dies on 12000
		BigDecimal d = new BigDecimal("12000");
		BigDecimal res = Factorial.bigFactorial(d);
		StringBuilder big_result = new StringBuilder(res.toString());
		BufferedStreams file = new BufferedStreams("factorials.txt");
		file.writeFile(big_result);
		
		//Testing using a loop, using an String Builder, the stack never dies
		Factorial.factorialLoop(20000);
	}
	
	//Testing a binary
	public static void binary(){
		int array[] =new int[10];
		for(int i = 0; i<10; i++)
			array[i]=i;
		int numero = 90000;
		System.out.println("Numero: "+numero+" esta: "+BinarySearch.binarySearch(array, numero, 0, array.length-1));
		System.out.println("Numero: "+numero+" esta: "+BinarySearch.loopBinaryS(array, numero));
	}
}
