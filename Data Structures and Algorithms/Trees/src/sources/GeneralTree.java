package sources;

public class GeneralTree <T>{
	protected Node<T> root = null;
	private int size = 0;
	public GeneralTree(){}
	//Accesors for Tree
	public Node<T> getRoot() { return root;	}
	public int getSize() { return size;	}
	
	//Creating tree root
	public Node<T> addRoot(T content) throws IllegalStateException {
		if (root == null){
			root = new Node<T>(null, content);
			size = 1;
		}
		return root;
	}
}
