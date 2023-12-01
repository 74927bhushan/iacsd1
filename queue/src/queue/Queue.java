package queue;

public class Queue {

	private int [] arr;
	private int front,rear;
	private int size;
	
	public 	Queue(int size) {
		this.size=size;
		front = rear=0;
		arr= new int[size];
	}
	
	public boolean isEmpty() {
		return( front== 0 && rear== 0   ); 
	}
	
	public boolean isFull() {
		return rear == size -1;
	}
	
	public boolean insert(int data) {
		if(isFull()) {
			return false;
		}
		arr[++rear]=data;
		return true;
	}
	public int delete() {
		if(isEmpty()) {
			return -999;
		}
		return arr[front++];
	}
	
	
	public void display() {
		if (isEmpty()) {
	        System.out.println("Queue is empty. No elements to display.");
	        return;
	    }
		System.out.println("Queue elements");
	 for(int i = front; i<= rear ; i++) {
		 System.out.println(arr[i]);
	 }
	 System.out.println();
	}
}
