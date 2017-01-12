
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
	
	public Node getTail(){
		if(this.tail == null){
			throw new IllegalStateException();
		} else {
			return this.tail;
		}
	}
	
	public int removeHead(){
		if(head == null){
			return -1;
		} else {
			Node removed = head;
			if(head == tail){
				head = tail = null;
			} else {
				head = head.getNext();
			}
			numElements--;
			return removed.getVal();
		}
	}
	
	// Removes first occurrence of 'val'.
	public void removeVal(int val){
		if(this.getHead() == null){
			throw new IllegalStateException();
		} else if(this.getHead().getVal() == val){
			this.removeHead();
		} else {
			Node temp = this.getHead();
			while(temp.getNext() != null){
				if(temp.getNext().getVal() == val){
					// If the tail is going to be deleted then adjust the tail pointer.
					if(temp.getNext() == tail){
						tail = temp;
					}
					temp.setNext(temp.getNext().getNext());
					numElements--;
					return;
				} else {
					temp = temp.getNext();
				}
			}
		}
	}
	
	public Node getHead(){
		if(this.head == null){
			throw new IllegalStateException();
		} else {
			return head;
		}
	}
	
	public int getValueAt(int index){
		int i = 0;
		Node temp = head;
		if(index < 0){
			return -1;
		} else if (index >= numElements){
			return -1;
		} else {
			while(i != index){
				temp = temp.getNext();
				i++;
			}
			return temp.getVal();
		}
	}
	
	public int getNumElements(){
		return numElements;
	}
	
	public Node getNode(int index){
		Node temp = head;
		int count = 0;
		if(index < 0){
			return null;
		} else if(index >= numElements){
			return null;
		} else {
			while(count != index){
				temp = temp.getNext();
				count++;
			}
			return temp;
		}
	}
	
	public void printList(){
		Node n = head;
		while(n != null){
			System.out.print(n.getVal() + " -> ");
			n = n.getNext();
		}
	}
	
	public void quicksort(int low, int high){
		if(high >= this.getNumElements()){
			return;
		} else if(low < 0){
			return;
		} else if(low < high){
			int pivot = partition(low, high);
			quicksort(low, pivot-1);
			quicksort(pivot+1, high);
		}
	}
	
	public int partition(int low, int high){
		// Choose the last element as the pivot.
		int pivotValue = this.getNode(high).getVal();
		int i = low-1;
		// Starting from the beginning to the second to last element.
		for(int j = low; j < high; j++){
			if(this.getValueAt(j) <= pivotValue){
				i++;
				swap(this.getNode(i), this.getNode(j));
			}
		}
		swap(this.getNode(i+1), this.getNode(high));
		return i+1;
	}
	
	public void swap(Node x, Node y){
		// Fix by using node value instead of int variables.
		int temp = x.getVal();
		x.setVal(y.getVal());;
		y.setVal(temp);
	}
	
	public void removeDuplicates(){
		if(this.getNumElements() <= 1)
			return;
		
		this.quicksort(0, this.getNumElements()-1);
		Node temp = this.getHead();
		Node tempNext = temp.getNext();
		while(tempNext != null){
			if(temp.getVal() == tempNext.getVal()){
				
			}
		}
	}
}
