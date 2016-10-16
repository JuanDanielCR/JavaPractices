package test;

import sources.*;
public class TestGeneralTree {
	public static void main(String args[]){
		GeneralTree<Integer> tree = new GeneralTree<>();
		Node<Integer> root = new Node<Integer>(0);
		tree.addRoot(root);
		
		//Creating nodes inside class
		Node<Integer> node1 = new Node<Integer>(1);
		root.addChild(node1);
		root.addChild(2);
		root.addChild(3);
		
		//Creating nodes outside
		Node<Integer> node4 = new Node<Integer>(4);
		Node<Integer> node5 = new Node<Integer>(5);
		Node<Integer> node6 = new Node<Integer>(6);
		Node<Integer> node7 = new Node<Integer>(7);
		Node<Integer> node8 = new Node<Integer>(8);
		
		root.getChilds().get(0).addChild(node4);
		root.getChilds().get(0).addChild(node5);
		root.getChilds().get(1).addChild(node6);
		node6.addChild(node7);
		node1.addChild(node8);
		
		tree.travelTree(root);
		System.out.println("yeah");
		
	}
}