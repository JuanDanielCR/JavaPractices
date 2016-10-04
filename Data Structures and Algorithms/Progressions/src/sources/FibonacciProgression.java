package sources;

public class FibonacciProgression extends Progression{
	protected long prev;
	public FibonacciProgression(){
		super(0);
		this.prev = 1;
	}
	public FibonacciProgression(long first, long second){
		super(first);
		prev = second - first; //fictitious value
	}
	protected void advance(){
		long temp = prev;
		prev = current;
		current += temp;
	}
}
