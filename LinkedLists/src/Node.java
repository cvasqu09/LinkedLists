
public class Node {
	private int val;
	private Node next;
	public Node(int val){
		this.val = val;
		this.next = null;
	}
	
	public void setNext(Node n){
		next = n;
	}
	
	public void setVal(int o){
		val = o;
	}
	
	public int getVal(){
		return val;
	}
	
	public Node getNext(){
		return next;
	}
}
