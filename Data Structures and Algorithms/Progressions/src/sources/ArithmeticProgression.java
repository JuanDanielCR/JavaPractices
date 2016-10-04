package sources;

public class ArithmeticProgression extends Progression{
	protected long increment;
	//Constructors for starting point and increment
	public ArithmeticProgression(){
		super(0);
		this.increment = 1;
	}
	public ArithmeticProgression(long stepsize){
		super(0);
		this.increment = stepsize;
	}
	public ArithmeticProgression(long stepsize, long start){
		super(start);
		this.increment =  stepsize;
	}
	/**Adds the arithmetic increment to the current value*/
	@Override
	protected void advance(){
		current+=increment;
	}
}
