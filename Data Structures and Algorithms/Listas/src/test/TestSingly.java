package test;

import sources.SinglyLinkedList;

public class TestSingly {
	public static void main(String args[]){
		SinglyLinkedList<Integer> list =  new SinglyLinkedList<>();
		list.addFirst(1);
		list.removeFirst();
		System.out.println("Yeah!");
	}
}
