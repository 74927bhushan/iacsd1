package doublyLinkedList;

public class Tester {

	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.insert(10);
		dll.display();
		dll.insert(20);
		dll.display();
		dll.insert(30);
		dll.display();
		dll.insert(40);
		dll.display();
		dll.insert(50);
		dll.display();
		dll.insert(60);
		dll.display();
		dll.insert(70);
		dll.display();
		dll.insert(566, 2);
		dll.display();
		dll.deleteByValue(566);
		dll.display();
		dll.deleteByPosition(1);
		dll.displayRev();
	}
	
	

}
