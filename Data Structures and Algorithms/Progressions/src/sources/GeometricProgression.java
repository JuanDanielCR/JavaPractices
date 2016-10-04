package sources;

public class GeometricProgression extends Progression{
	protected long base;
	public GeometricProgression(){
		super(1);
		this.base = 2;
	}
	public GeometricProgression(long b){
		super(1);
		this.base = b;
	}
	public GeometricProgression(long b, long start){
		super(start);
		this.base = b;
	}
	/**Multiplies the current value by the geometric base*/
	protected void advance(){
		current *= base;
	}
}
