package sources;

public interface Pet {
	//Three equivalent declarations, methods on interfaces are always public and abstract
	public String getName();
	public abstract void setName(String name);
	void play();
}
