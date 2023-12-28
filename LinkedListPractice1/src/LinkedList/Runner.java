package LinkedList;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		
		
//		ll.display();
//		ll.insert(null, null, null)
//		ll.insertAtPosition(null, null, null, 0)

	ll.insert("life_of_pie","bhushan", "life");
		ll.insert("two_states","durjoy_datta", "romance");
//		//ll.display();
//		
	ll.insertAtPosition("game_of_thrones","jj_rowling","drama", 2);
//		ll.display();
//		System.out.println("---------------------------------------------");
//		ll.deleteByPosition(3);
	ll.display();
	



	
	Scanner sc = new Scanner(System.in);
	int choice;
	do {
	System.out.println("enter your choice \n"
			+ "1--->add book to the shelf \n"
			+ "2--->add by position \n"
			+ "3--->display books  \n"
			+ "4---->delete books by position   \n"
			+ "5----->exit");
	
	choice = sc.nextInt();
	sc.nextLine();
	switch(choice) {
	case 1:
		System.out.println("insert name , author and genre of the book");
		ll.insert(sc.next(), sc.next(),sc.next());
		break;
		
	case 2:
		System.out.println("enter book details like name,author and genre and also position ");
		ll.insertAtPosition(sc.next(), sc.next(),sc.next(), sc.nextInt());
		break;
		
	case 3:
		System.out.println("displaying all the books in book store " );
		   ll.display();
		break;
		
	case 4:
		System.out.println("enter the position you want to delete");
		ll.deleteByPosition(sc.nextInt());
		break;
	}
	
	
	}while(choice!=5);
	sc.close();
	}
}