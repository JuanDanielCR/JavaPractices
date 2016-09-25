
public class Counter {
	private int counter;
	public Counter(){
		counter = 0;
	}
	public int getCounter(){
		return counter;
	}
	public void aumentarCounter(){
		counter++;
	}
	public void reset(){
		counter = 0;
	}
}
