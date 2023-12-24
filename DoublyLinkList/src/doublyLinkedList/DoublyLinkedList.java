package doublyLinkedList;

public class DoublyLinkedList {

	private Node head;

	public DoublyLinkedList() {
		head = null;

	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}

		if (head == null) {
			head = newNode;
			return true;
		}
		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();

		}
		last.setNext(newNode);
		newNode.setPrev(last);
		return true;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();

		}
		System.out.println();
	}

	public boolean insert(int data, int position) {
		if (position < 1) {
			return false;
		}
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (position == 1) {
			if (head != null) {
				newNode.setNext(head);
				head.setPrev(newNode);
			}
			head = newNode;
			return true;
		}
		Node prev = head;
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}
		}
		newNode.setPrev(prev);
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		if (newNode.getNext() != null) {
			newNode.getNext().setPrev(newNode);
		}
		return true;
	}

	public boolean deleteByValue(int data) {
		if (head == null) {
			return false;
		}
		if (head.getData() == data) {
			head = head.getNext();
			if (head != null) {
				head.setPrev(null);
			}
			return true;
		}
		Node del = head;
		while (del.getData() != data) {
			del = del.getNext();
			if (del == null) {
				return false;
			}
		}
		del.getPrev().setNext(del.getNext());
		if (del.getNext() != null) {
			del.getNext().setPrev(del.getPrev());
		}
		return true;
	}

	public boolean deleteByPosition(int position) {
		if (head == null) {
			return false;
		}
		if (position == 1) {
			head = head.getNext();
			if (head != null) {
				head.setPrev(null);
			}
			return true;

		}
		Node del = head;
		for (int i = 1; i < position; i++) {
			del = del.getNext();
			if (del == null) {
				return false;
			}
			del.getPrev().setNext(del.getNext());
			if (del.getNext() != null) {
				del.getNext().setPrev(del.getPrev());
			}
		}
		return true;
	}

	public void displayRev() {
		if (head == null) {
			return;
		}
		Node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getPrev();
		}
		System.out.println();
	}
}
