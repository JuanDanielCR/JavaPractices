package source;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Factorial {
	//crashes on 12 for int size, 20 for long size
	public static int calculateFactorial(int n)throws IllegalArgumentException{
		if(n < 0){
			throw new IllegalArgumentException();
		}else if(n == 0){
			return 1;
		}
		return n*calculateFactorial(n-1);
	}
	//Use of Big Integer and BigDecimal for no size limit, just a limit for stack overflow error on recursion
	public static BigInteger bigFactorial(BigInteger n)throws IllegalArgumentException{
		if(n.compareTo(BigInteger.ZERO) == -1){
			throw new IllegalArgumentException();
		}else if(n.compareTo(BigInteger.ZERO)==0){
			return BigInteger.ONE;
		}
		return n.multiply(bigFactorial(n.subtract(BigInteger.ONE)));
	} 
	//Big decimal
	public static BigDecimal bigFactorial(BigDecimal n)throws IllegalArgumentException{
		if(n.compareTo(BigDecimal.ZERO) == -1){
			throw new IllegalArgumentException();
		}else if(n.compareTo(BigDecimal.ZERO)==0){
			return BigDecimal.ONE;
		}
		return n.multiply(bigFactorial(n.subtract(BigDecimal.ONE)));
	} 
	
	//Change recursion for a loop
	public static void factorialLoop(int n){
		BigDecimal fact = BigDecimal.valueOf(1);
	    for (int i = 1; i <= n; i++)
	        fact = fact.multiply(BigDecimal.valueOf(i));
	    //Code for output
	    StringBuilder big_result = new StringBuilder(fact.toString());
	    BufferedStreams file = new BufferedStreams("factorials_loop.txt");
		file.writeFile(big_result);
	}
}
