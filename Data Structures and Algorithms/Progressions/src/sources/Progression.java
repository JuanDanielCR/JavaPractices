package sources;

public class Progression {
	//instance variable
	protected long current;
	
	/**Constructs a progression starting at zero*/
	public Progression(){
		this.current = 0;
	}
	/**Constructs a progression with a given value*/
	public Progression(long start){
		this.current = start;
	}
	/**Returns the next value of the progression*/
	public long nextValue(){
		long answer = current;
		advance();
		return answer;
	}
	/**Protected because this will change according to each progression type*/
	protected void advance(){
		current++;
	}
	/**Prints the next n values of the progression*/
	public void printProgression(int n){
		System.out.print(nextValue());
		for(int i = 0; i<n; i++){
			System.out.print(" "+nextValue());
		}
		System.out.println(); //End of line
	}
}
