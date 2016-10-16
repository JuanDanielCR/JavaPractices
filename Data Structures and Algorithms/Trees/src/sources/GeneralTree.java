package sources;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

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
	
	public Node<T> addRoot(Node<T> root) throws IllegalStateException {
		if (root == null){
			this.root = root;
			size = 1;
		}
		return root;
	}
	
	//Travelling the three from the leaf to the root, PRE ORDER
	public void travelTree(Node<T> node){
		System.out.println(node.getContent());
		if(!(node.getChilds().isEmpty())){
			for(int i=0; i<node.getChilds().size();i++){
				travelTree(node.getChilds().get(i));
				//System.out.println(node.getChilds().get(i).getContent());
			}
		}
	}
	
}
