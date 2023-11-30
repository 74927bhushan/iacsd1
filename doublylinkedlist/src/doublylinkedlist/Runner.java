package doublylinkedlist;

public class Runner {

	public static void main(String[] args) {
	
		
		Doublylinkedlist dll = new Doublylinkedlist();
		
		dll.insert(10);
		dll.insert(20);
		dll.insert(30);
		
		dll.display();
		
		dll.insert(15, 2);
		dll.insert(25, 4);
		
		dll.display();

	}

}
