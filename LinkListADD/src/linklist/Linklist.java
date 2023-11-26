package linklist;

public class Linklist {
	
	private ListNode head;
	
	//getter for head whose data type is ListNode.
	public ListNode gethead() {
		return head;
	}
	
	//constructor of public class Link list.
	public Linklist() {
		head=null;
	}
	
	//create method for inserting the data;
	
	public  boolean insert(int data) {
		//create new node on heap to store data 
		ListNode newnode= new ListNode(data);
		if(newnode==null) {
			return false;
		}
//if the head is null ,indicating that list is empty
//assign the newly created node as the first node
		if(head == null) {
			head = newnode;
			return true;
		}
	
// initializes the new variable "last" and assign it the reference of head,initially pointing to the beginning of the list
		ListNode last = head;
//this will find out the last element of the list where next is null;
		while(last.getNext()!=null) {
//holding the reference of the last node (last variable)
			last = last.getNext();
			
		}
//inserting the new node in the last 
//last is holding the reference of last node and then another variable new node is pointing to last so adding new node at the last
		last.setNext(newnode);
		return true;	
	}
	
	public void display1() {
// variable temp of type ListNode is initialized with the value of "head" which is start of the node;
		ListNode temp = head;
//inserting a while loop to traverse till the end of the list,
// in this case it will traverse till temp does'nt find null specifing end of the list ;
		while(temp != null) {
//prints the data associated with the current node that temp is pointing to
			System.out.println(temp.getData()+" ");
//sends the temp to next node
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	//creating a method insert to insert at specified location;
	public boolean insert(int data,int position) {
		//if the location is 0 or equal to 0 position is invalid return false;
		if(position <=0) {
		return false;
	}
		//creating a new node ;
		ListNode newnode = new ListNode(data);
		//only checking memory is allocated or not if not return false;
		if (newnode==null) {
			return false;
		}
		//if the position of the node is 1st then set the next pointer to the previous head; 
		if (position == 1) {
			newnode.setNext(head);
			head = newnode;
			return true;
		}
		
		//if the position is not first then 
//locate the previous node where you want to insert 
		ListNode prev = head;
		
// for going to that location we need to iterate and go the location -1 
//i.e. if u want to insert at the 3rd location go to the 2nd one and find the pointer 
		//the new node is pointing to the next node of 2nd location ;
		for(int i=1;i<position-1;i++) {
			
			prev= prev.getNext();
			if (prev==null) {
				return false;
			}
			
			
			
		}
		//now link the new node to the previous node 
		newnode.setNext(prev.getNext());
		prev.setNext(newnode);
		return true;
}

	public void display(ListNode temp) {
		if(temp ==null) {
		System.out.println();
		return;
	}
	System.out.print(temp.getData() + " ");
    display(temp.getNext());
}
	public void displayRev(ListNode firstnode) {
		if(firstnode==null) {
			System.out.println();
			return;
	}
		displayRev(firstnode.getNext());
		System.out.println(firstnode.getData() + "");
}
	}


