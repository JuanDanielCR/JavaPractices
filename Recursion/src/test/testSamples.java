package test;

import java.math.BigDecimal;
import java.math.BigInteger;

import source.BufferedStreams;
import source.Factorial;

public class testSamples {
	public static void main(String args[]){
		//Testing factorial
		System.out.println(Factorial.calculateFactorial(12));
		
		//Testing bigInteger factorial
		BigInteger n = new BigInteger("20");
		BigInteger result = Factorial.bigFactorial(n);
		System.out.println(result.longValue());
		
		//Testing for BigDecimal, using an StringBuilder and a file, the stack of recursion dies on 12300
		BigDecimal d = new BigDecimal("12300");
		BigDecimal res = Factorial.bigFactorial(d);
		StringBuilder big_result = new StringBuilder(res.toString());
		BufferedStreams file = new BufferedStreams("factorials.txt");
		file.writeFile(big_result);
	}
}
