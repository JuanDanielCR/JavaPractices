
public class ArrayStack<E> implements Stack<E>{
	public static final int CAPACITY = 100;
	private E[] data;
	private int top = -1;
	
	public ArrayStack( ) { this(CAPACITY); } // constructs stack with default capacity
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) { // constructs stack with given capacity
		data = (E[]) new Object[capacity]; // safe cast; compiler may give warning
	}
	
	@Override
	public int size() {
		return top+1;
	}

	@Override
	public boolean isEmpty() {
		return (top == -1);
	}

	@Override
	public void push(E e)throws IllegalStateException {
		data[++top] = e;
	}

	@Override
	public E top() {
		if(this.isEmpty())
			return null;
		return data[top];
	}

	@Override
	public E pop() {
		if(this.isEmpty())
			return null;
		E element = data[top];
		data[top] = null;
		top--;
		return element;
	}
	
}
