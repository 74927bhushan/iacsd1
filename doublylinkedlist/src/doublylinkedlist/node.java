package doublylinkedlist;

public class node {

	node prev;
	node next;
	int data;
	
	
	
	public node(node prev, node next, int data) {
		super();
		this.prev = prev;
		this.next = next;
		this.data = data;
	}
	
	public node(int data2) {
		// TODO Auto-generated constructor stub
	}

	public node getPrev() {
		return prev;
	}
	public void setPrev(node prev) {
		this.prev = prev;
	}
	public node getNext() {
		return next;
	}
	public void setNext(node next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	
}
