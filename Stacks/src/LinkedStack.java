/**
 * Implementing a stack with a single linked list
 * */
public class LinkedStack<E> implements Stack<E> {
	private SinglyLinkedList<E> stack = new SinglyLinkedList<>();  
	@Override
	public int size() {
		return stack.getSize();
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public void push(E e) {
		stack.addFirst(e);
	}

	@Override
	public E top() {
		return stack.first();
	}

	@Override
	public E pop() {
		return stack.removeFirst();
	}
	
}
