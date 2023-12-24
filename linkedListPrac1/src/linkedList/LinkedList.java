package linkedList;

public class LinkedList {

	private Node Head;
	
	
	public LinkedList() {
		
		Head = null;
	}

     public Node getHead() {
		return Head;
	}
	
     public boolean insert(int data) {
    	
    	 Node newNode = new Node(data);
    	 
    	 if(newNode==null) {
    		 return false; 
    	 }
    	
    	 if(Head==null) {
    		 Head=newNode;
    		 return true;
    	 }
    	 
    	 Node last = Head;
    	 while(last.getNext()!=null) {
    		last=last.getNext();
    	 }
    	 last.setNext(newNode);
    	 return true;
    	 
     }
     
     public void display() {
    	 Node temp =Head;
    	 while(temp!=null) {
    		 System.out.print(temp.getData()+" ");
    		 temp=temp.getNext();
    	 }
    	 System.out.println();
     }
     
     public boolean insert(int data,int position) {
    	 if(position <=0) {
    		 return false;
    	 }
    	 Node newNode = new Node(data);
    	 if(newNode==null) {
    		 return false;
    	 }
    	 if(position ==1) {
    		 newNode.setNext(Head);
    			 Head=newNode;
    		 
    	 }
    	 Node prev=Head;
    	 for(int i =1;i<position-1;i++) {
    		 prev=prev.getNext();
    		 if(prev==null) {
    			 return false;
    		 }
    	 }
    	 newNode.setNext(prev.getNext());
    	 prev.setNext(newNode);
		return true;
    	 
     }
     public void display(Node firstnode) {
    	 if(firstnode==null) {
    		 System.out.print(" ");
    		 return ;
    	 }
    	 System.out.print(firstnode.getData() +" ");
    	 display(firstnode.getNext());
    	 
     }
     
     public void displayRev(Node firstnode)
     {
    	 if(firstnode==null)
    	 {
    		 return;
    	 }
    	 displayRev(firstnode.getNext());
    	 System.out.print(firstnode.getData()+" ");
     }
     
     
     public boolean deleteByValue(int data) {
    	 if(Head==null) {
    		 return false;
    		 
    	 }

    	 if(Head.getData()==data) {
    		 Head=Head.getNext();
    		 return true;
    	 }
    	 Node del=Head,prev=Head;
    	 while(del.getData()!=data) {
    		 prev=del;
    		 del=del.getNext();
    			 if(del==null) {
    				 return false;
    			 }
    		 }
    	 prev.setNext(del.getNext());
    	 return true;
    	 }
     
     public boolean deleteByPostn(int position) {
    	 if(Head==null||position<=0) {
    		 return false;
    	 }
    	 if(position ==1) {
    		 Head=Head.getNext();
    		 return true;
    	 }
    	 Node prev=Head;
    	 for(int i=1;i<=position;i++) {
    		 prev=prev.getNext();
    		 if(prev.getNext()==null) {
    			 return false;}
    		 }
    		Node del=prev.getNext();
    		prev.setNext(del.getNext());
    		return true;
     }
}

