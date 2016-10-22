package sources;

public class Spider extends Animal{
	private static final int legs = 8;
	
	public Spider(){
		super(legs);
	}

	@Override
	public void eat() {
		System.out.println("Araña comiendo");
	}
}
