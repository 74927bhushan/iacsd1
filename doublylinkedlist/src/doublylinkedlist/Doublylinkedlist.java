package doublylinkedlist;

public class Doublylinkedlist {
	
	node head;
	
	
	//creating a constructor and initializing the head to null;
        public Doublylinkedlist() {
		this.head = null;
	}
	
	//creating the method insert and adding data as its parameter;
	public boolean insert(int data) {
		//creating the new node object;
		node newnode = new  node(data);
		//checking that if new node is empty return false
		if(newnode==null) {
			return false;
		}
		if(head==null) {
			head=newnode;
			return true;
		}
		node last = head;
		while(last.getNext()!=null) {
			last=last.getNext();
			
		}
		last.setNext(newnode);
		newnode.setPrev(last);
		return true;
	}
	
	 //method to display 
	public void display() {
		node temp = head;
		while(temp != null) {
			System.out.println(temp.getData() );
			temp = temp.getNext();
		}
		    System.out.println();
		
	}
	
	 //method for inserting at position 

	public boolean insert(int data,int position) {
		if(position < 1) {
			return false;
		}
		node newnode = new node(data) ;
			if(newnode == null) {
				return false;
			}
		if(position==1) {
			if(head != null) {
				
				//newnode's next is in head and head's prev is in new node so head is now 2nd node and newnode is 1st;
				newnode.setNext(head);
				head.setPrev(newnode);
			}
			//now bringing back the head to 1st location
			head=newnode;
			return true;
		}
		//initializing new variable 'prev' and assigning it to head;
		node prev = head;
		//if the position is not 1st so iterate using prev;
		for(int i= 1;i<position-1;i++) {
			prev=prev.getNext();
			if(prev==null) {
				return false;
			}
		}
		newnode.setPrev(prev);
		newnode.setNext(prev.getNext());
		prev.setNext(newnode);
		if(newnode.getNext()!=null) {
			newnode.getNext().setPrev(newnode);
		}
		return true;
	}
}







