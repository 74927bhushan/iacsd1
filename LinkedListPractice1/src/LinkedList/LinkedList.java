package LinkedList;

public class LinkedList {

	
	private Book Head;

	public Book getHead() {
		return Head;
	}
	
	public LinkedList() {
		super();
		Head = null;
	}

	public void setHead(Book head) {
		Head = head;
	}

	
	public boolean insert(String name,String author,String genre) {
		
		Book newBook = new Book(name,author,genre);
		
		if(newBook==null) {
			return false;
		}
		
		if(Head==null) {
			Head=newBook;
			return true;
		}
		
		Book last =Head;
		while(last.getNext()!=null) {
			last=last.getNext();
		}
		last.setNext(newBook);
		return true;
	}
	
	
	public void display() {
		Book temp = Head;
		while(temp != null) {
			System.out.println(temp.getData() + " ");
			temp=temp.getNext();
			
		}
	}
		
		public boolean insertAtPosition(String name,String author,String genre,int position) {
			
			Book newBook = new Book(name,author,genre);
			
			if(position <= 0 || newBook == null ) {
				return false;
			}
			
			if(position==1) {
				
				if(Head != null) {
					newBook.setNext(Head); // head is not null then 1st set newbook's next to already linked head 
					//and then set head to newbook
					Head=newBook;
					return true;
				}
				Head = newBook;
				return true;
			}
			
			Book last = Head;
			for(int i=1;i<position-1;i++) {
				if(last==null) {
					return false;
				}
				
				last=last.getNext();
				
				
			}
			newBook.setNext(last.getNext());
			last.setNext(newBook);
			
			return true;
		
	}
	
		
	public boolean deleteByPosition(int position) {
		
		if(Head==null || position <1) {
			return false;
		}
		
		if(position==1) {
			Head=Head.getNext();
					return true;
		}
		
		int currentPosition=1;
		Book temp = Head;
		while(temp!=null && currentPosition < position -1 ) {
			temp=temp.getNext();
			currentPosition++;
		}
		if(temp==null || temp.getNext()==null) {
			return false;
		}
		temp.setNext(temp.getNext().getNext());
		return true;
	}
	
	
	
	
	
}
