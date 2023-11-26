package linklist;

import linklist.Linklist.*;


public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				
				Linklist mylist = new Linklist();
				
				mylist.display1();
				mylist.insert(10);
				mylist.insert(20);
				mylist.insert(40);
				mylist.insert(60);
		
				mylist.display1();
			
				
				mylist.insert(76, 4);
				mylist.display1();
				mylist.insert(86, 5);
				mylist.insert(96, 6);
				mylist.insert(06, 8);
				mylist.display1();
				
				
				System.out.println("----------------");
				mylist.display(mylist.gethead());
				System.out.println("------------------");
				mylist.displayRev(mylist.gethead());
				
			}

		

	}


