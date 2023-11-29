package circularlinkedlist;

import linkedlistprac.Linkedlist;

public class Tester {

	public static void main(String[] args) {
	
		CircularLinkedList1 ll = new CircularLinkedList1();
		
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		
		ll.display();
		
	    ll.deletebyposition(3);
		ll.display();
		ll.deleteByVal(40);
		ll.display();
		ll.deleteByVal(10);
		ll.display();

	}


		

	}


