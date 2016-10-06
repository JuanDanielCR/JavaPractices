package sources;

//Making Progression an abstract class, and using template method pattern
public abstract class AbstractProgression {
	//instance variable
	protected long current;
	
	/**Constructs a progression starting at zero*/
	public AbstractProgression(){
		this.current = 0;
	}
	/**Constructs a progression with a given value*/
	public AbstractProgression(long start){
		this.current = start;
	}
	/**Returns the next value of the progression*/
	public long nextValue(){
		long answer = current;
		//Although advance is abstract and it doesn't  have body, we can call it in here
		//the body will be overrided this is called template method pattern, because of calling
		//an abstract behavior inside a concrete behavior
		advance();
		return answer;
	}
	/**Protected because this will change according to each progression type*/
	//protected void advance(){
		//current++;
	//}
	/**Making advance an abstract method, for overriding it, the past implementation, just 
	 * emulates Arithmetic progression*/
	protected abstract void advance();
	/**Prints the next n values of the progression*/
	public void printProgression(int n){
		System.out.print(nextValue());
		for(int i = 0; i<n; i++){
			System.out.print(" "+nextValue());
		}
		System.out.println(); //End of line
	}
}
