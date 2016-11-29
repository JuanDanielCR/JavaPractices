
public class SinglyLinkedList<E> {
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	public SinglyLinkedList(){}
	/**Gets first element*/
	
	/**get size*/
	public int getSize(){
		return size;
	}
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
		head =  new Node<E>(e, head);
		if(size == 0)
			tail =  head;
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
	/**Show all the elements from a list*/
	public void showElements(){
		Node<E> aux;
		aux = head;
		while(aux.next != null){
			System.out.println(aux.getElement());
			aux = aux.getNext();
		}
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
	}
}
