package validations;

import java.time.LocalDate;

import exceptions.InvalidInputException;
import mess_Core.Mess_Core;
import mess_Core.Plan;

public class Validations {

	
	public static Plan validateplan(String plan) throws InvalidInputException {
		return Plan.valueOf(plan.toUpperCase());
	}
	
	public static LocalDate validatedate(String date) throws InvalidInputException {
		LocalDate openingdate1 = LocalDate.parse(date);
		LocalDate date2 = LocalDate.now();
		
		if(openingdate1.isBefore(date2)) 
			throw new InvalidInputException("invalid date ");
		else
			System.out.println("date validation sucessfull");
		return openingdate1;
	}
	
	//(int custid, String f_Name, String l_Name, String email, double amount, Plan messplan,
		//	LocalDate reg_Date)
	
	public static Mess_Core validateallinput(int custid, String f_Name, String l_Name, String email, double amount, String messplan,String reg_Date) throws InvalidInputException {
		LocalDate date4 = validatedate(reg_Date);
		Plan plan = (Plan.valueOf(messplan.toUpperCase()));
		//int custid, String f_Name, String l_Name, String email, double amount, Plan messplan,
		//LocalDate reg_Date
		return new Mess_Core( custid, f_Name, l_Name, email, amount,plan,date4);
	}
}
