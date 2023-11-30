package stack;

public class Stack  <T>{
	private T[] arr;
	private int size;
	private int top;
	
	public Stack(int size) {
		this.size=size;
		top =-1;
		arr =(T []) new Object[size];
		
	}
	public boolean isEmpty() {
		return top == -1;
		
	}
	public boolean isFull() {
		return top == size-1;
	}
	
	public boolean push(T data) {
		if(isFull()) {
			return false;
		}
		arr[++top]=data;
		return true;
	}
	
public T pop() {
	if(isEmpty()) {
		return null;
	}
	return arr[top--];
}

	public T peek() {
		if (isEmpty()) {
			return null;
		}
		return arr[top];
	}
	
	public void display() {
		
		System.out.println("stack elements are :-");
		for(int i=top ; i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
}
