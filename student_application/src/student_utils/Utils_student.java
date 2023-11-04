package student_utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import core_class.Students;

public class Utils_student {

	// Creating a method to populating the Array-list with student data.
	public static List<Students> addstud() {
		List<Students> stud = new ArrayList<Students>();
		stud.add(new Students("anurag", 239079, 101));
		stud.add(new Students("bhushan", 239090, 102));
		stud.add(new Students("mohan", 239011, 103));
		stud.add(new Students("rishub", 239052, 104));
		stud.add(new Students("himanshu", 239043, 105));
		stud.add(new Students("ashwin", 239034, 106));
		stud.add(new Students("shiv", 239025, 107));
		stud.add(new Students("shivam", 239025, 100));		
        return stud;

	}

	// adding a method to display the student data.
	public static void displaystud(List<Students> stud) {
		System.out.println("the enrolled students are \n");
		for(Students s :stud) {
	        System.out.println("Name -> " + s.getName() + ", Registration Number -> " + s.getRegno() + ", Age -> " + s.getAge());
		};
		
	}

	// adding a method to sort the students according to their registration number.
	public static List<Students> sortstud(List<Students> stud) {
		stud.sort(Comparator.comparingInt(Students::getRegno));
		return stud;

	}
	// adding a method to sort according to the age of the students using lambda expression.
	public static List<Students> sortage(List<Students> stud){
		//stud.sort(Comparator.comparingInt(Students::getAge));
		Collections.sort(stud,(s1,s2)->((Integer)(s1.getAge())).compareTo(s2.getAge()));
		return stud;
		
	}
	

}
