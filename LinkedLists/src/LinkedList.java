
public class LinkedList {
	private Node head;
	private Node tail;
	private int numElements;
	public LinkedList(){
		head = null;
		tail = null;
		numElements = 0;
	}
	
	public void addToHead(int x){
		if(head == null){
			head = tail = new Node(x);
		} else {
			Node n = new Node(x);
			n.setNext(head);
			head = n;
		}
		numElements++;
	}
	
	public void addToTail(int x){
		if(head == null){
			head = tail = new Node(x);
		} else {
			tail.setNext(new Node(x));
			tail = tail.getNext();
		}
		numElements++;
	}
	
	public int getTail(){
		if(this.tail == null){
			throw new IllegalStateException();
		} else {
			return this.tail.getVal();
		}
	}
	
	public int removeHead(){
		if(head == null){
			return -1;
		} else {
			Node removed = head;
			head = head.getNext();
			numElements--;
			return removed.getVal();
		}
		
	}
	
	public int getHead(){
		if(this.head == null){
			throw new IllegalStateException();
		} else {
			return this.head.getVal();
		}
	}
	
	public void printList(){
		Node n = head;
		while(n != null){
			System.out.print(n.getVal() + " -> ");
			n = n.getNext();
		}
	}
	
	public void quicksort(LinkedList l, int low, int high){
		if(low < high){
			int pivot = partition(l, low, high);
			quicksort(l, low, pivot);
			quicksort(l, pivot, high);
		}
	}
	
	public int partition(LinkedList l, int low, int high){
		int pivot = l.getHead();
		
	}
}
