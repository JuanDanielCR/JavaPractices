package sources;

import java.util.ArrayList;

/**Nested class Node*/
public class Node<T>{
	private Node<T> parent;
	private ArrayList<Node<T>> childs = new ArrayList<Node<T>>();
	private T content;
	
	//Constructors
	public Node(Node<T> parent, T content ){
		this.parent = parent;
		this.content = content;
	}
	
	public Node(T content){
		this.parent = null;
		this.content = content;
	}
	
	//Accesors for node
	public ArrayList<Node<T>> getChilds() { return childs; }
	public T getContent() { return content; }
	public Node<T> getParent() { return parent;	}
	
	//Update methods
	public void setChilds(ArrayList<Node<T>> childs) { this.childs = childs;	}
	public void setContent(T content) { this.content = content;	}
	
	//Set a parent TO a node
	public void setParent(Node<T> parent) {
		Node<T> son =(Node<T>) this;
		parent.addChild(son);
	    this.parent = parent;
	}
	
	//Set a children TO a node
	public void addChild(Node<T> child){
		child.parent = this; //this, refers to the current object: parent.addChild();
		this.childs.add(child);
	}
	
	//Adding a child TO a parent
	public void addChild(T content){
		Node<T> child = new Node<T>(content);
		child.parent = (this);
		this.childs.add(child);
	}
	
	//isLeaf
	public boolean isLeaf() {
        if(this.childs.size() == 0) 
            return true;
        else 
            return false;
    }
}//end of nested