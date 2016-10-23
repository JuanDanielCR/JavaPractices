package sources;

public class SinglyLinkedList<E> {
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	public SinglyLinkedList(){}
	
	/**isEmpty returns if size == 0 */
	public boolean isEmpty(){
		return size == 0;
	}
	/**Returns but doesn't remove first element*/
	public E first(){
		if(isEmpty()) return null;
		return head.getElement();
	}
	/**Returns but doesn't remove last element*/
	public E last(){
		if(isEmpty()) return null;
		return tail.getElement();
	}
	/**Add a new head*/
	public void addFirst(E e){
		head =  new Node<E>(e, null);
		if(size == 0)
			tail =  head;
		size++;
	}
	/**Add a new tail*/
	public void addLast(E e){
		Node<E> newest =  new Node<E>(e, null);
		if(isEmpty()){
			head = newest;
		}else{
			tail.setNext(newest);
		}
		tail = newest;
		size++;
	}
	/**Remove the first element*/
	public E removeFirst(){
		if(isEmpty()){
			return null;
		}
		E answer = head.getElement();
		head = head.next;
		size --;
		if(size == 0){
			tail = null;
		}
		return answer;
	}
	/**Nested node*/
	private static class Node<E>{
		private E element;
		private Node<E> next;
		public Node(E element, Node<E> next){
			this.element =  element;
			this.next =  next;
		}
		public E getElement() {
			return element;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> next) {
			this.next = next;
		}
	}
}
