package student_tester;


import java.util.List;
import java.util.Scanner;
import core_class.Students;
import student_utils.Utils_student;

public class Tester {

	public static void main(String[] args) {
		 List<Students> stud =Utils_student.addstud();
	  

		try(Scanner sc = new Scanner(System.in)){
			boolean status= false;
			while(!status) {
				try {
					System.out.println("1.Display Enrolled Students \n 2.Sort according to Registration number 3.Sort according to Age 4.EXIT");
					switch(sc.nextInt()) {
					
					case 1:
						System.out.println("enrolled students::");
						 List<Students> stud1 =Utils_student.addstud();;
						Utils_student.addstud();
						Utils_student.displaystud(stud);
						
						break;
						
					case 2:
						System.out.println("Sorted according to their regno");
					
						Utils_student.sortstud(stud);
						System.out.println(stud);
						break;
						
					case 3:
						System.out.println("Sorted according to the age");
						Utils_student.sortage(stud);
						System.out.println(stud);
						
					case 4:
						System.exit(0);
						System.out.println("Thankyou for using our Application");
						break;
				}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}
