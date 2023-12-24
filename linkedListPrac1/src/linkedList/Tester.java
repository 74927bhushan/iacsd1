package linkedList;

public class Tester {

	public static void main(String[] args) {
		
		LinkedList ll= new LinkedList();

		ll.insert(10);
		ll.insert(19);
		ll.insert(87);
		ll.insert(97);
		ll.insert(37);
		ll.insert(67);
		ll.display();
		System.out.println("--------------------------------------------------------");
		
		ll.insert(155, 4);
		ll.display(ll.getHead());
		System.out.println("--------------------------------------------------------");
		ll.insert(678, 2);
		ll.display(ll.getHead());
		System.out.println("----------------------------------------------------------");
		ll.displayRev(ll.getHead());
		
		System.out.println("------------------------------------------");
		ll.deleteByValue(37);
		ll.display();
		ll.deleteByPostn(3);
		ll.deleteByPostn(6);
		ll.display();
		ll.display();
		ll.deleteByPostn(1);
		ll.display();
	}

}
