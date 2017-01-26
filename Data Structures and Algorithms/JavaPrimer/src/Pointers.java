/**
 * Class that use javadoc and demonstrates how java use pointers and pass by value
 * @author JuanDanielCR
 * 
 */
public class Pointers {
	public static void main(String args[]){
		Counter a; //reference variable which holds a pointer
		a = new Counter(); //1. memory, 2. default initialize 3. return memory allocation a
		
		Counter b = new Counter(); //b points to allocation b
		b.aumentarCounter(); //b = 1
		
		Counter c = b; //c points to allocation b
		c.aumentarCounter(); // c = 2 & b = 2
		b.aumentarCounter(); // c = 3 & b = 3
		
		c = new Counter(); //c now points to a new allocation
		c.aumentarCounter(); //c = 1 & b = 3
		
		// a: 0, b: 3
		swip(a,b);
		// a is still 0 and b is still 3, so java is always pass by value and not by reference
		
		// a: 0
		foo(a);
		// a: 1 not a: 2 as would expected in pass by reference
		System.out.println("a= "+a.getCounter()+" outside the function");
		
		//Pointers are also passed by value, this means whit a copy
		//a: 1
		badReset(a);
		//a is still 1
		goodReset(a);
		//a is 0
		System.out.println("Yeah");
	}
	
	/**Test for watching pass by reference, if the value of and b changes between them is pass by reference
	 * @param a
	 * @param b
	 */
	public static void swip(Counter a, Counter b){
		Counter temp = new Counter();
		temp = a;
		a = b;
		b = temp;
	}
	public static void foo(Counter a){
		a.aumentarCounter();
		//changing a
		a  = new Counter(); 
		//now a points to another place just like C, in C++ the original 'a' object would change its allocation
		//in pass by reference the original allocation would change, and this result would be shown outside this function
		a.aumentarCounter();
		a.aumentarCounter();
		System.out.println("a= "+a.getCounter()+" inside a function where a = new Counter()");
	}
	
	public static void badReset(Counter copy){
		copy = new Counter();
		copy.reset();
	}
	
	public static void goodReset(Counter copy){
		copy.reset();
	}
}