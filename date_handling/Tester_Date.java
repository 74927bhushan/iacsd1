package date_handling;
import date_handling.Persons;
import static date_handling.Persons.sdf;

import java.util.Scanner;

public class Tester_Date {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("ENTER THE -NAME- &  DATE-OF-BIRTH  OF THE  1st PERSON ");
			Persons p1 = new Persons(sc.next(),sdf.parse(sc.next()));
			System.out.println("ENTER THE -NAME- &  DATE-OF-BIRTH   OF THE  2nd PERSON ");
			Persons p2 = new Persons(sc.next(),sdf.parse(sc.next()));
			
			if (p1.getDob().before(p2.getDob()))
				System.out.println(p1.getPname() + " is senior");
			else 
				System.out.println(p2.getPname() + " is senior");
		}catch(Exception e) {
			System.out.println("error" +e);
		}

	}

}
