package validations;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import Exceptions.InvalidInputException;
import core.Core;
import department.Department;

public class Validations {

	public static Department validateDepartment(String department)throws InvalidInputException {
		return Department.valueOf(department.toUpperCase());
	}
	
	public static LocalDate parseValidateDate(String date) throws InvalidInputException{
		if(LocalDate.parse("2000-01-01").isAfter(LocalDate.parse(date)))
		{
		 throw new InvalidInputException("please enter date after year 2000");
		}
		return LocalDate.parse(date);
	}
	
	public static String parseandvalidateEmail(String email,String password) throws InvalidInputException {
		 String emailRegex = "^[^@]+@[^@]+\\.[^@]+$";
		 String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
		if(!email.matches(emailRegex)) 
			throw new InvalidInputException("please enter valid email");
		if(!password.matches(passwordRegex))
			throw new InvalidInputException("enter valid password with 1 word capital,1alphaneumwric and specialchar");
		return email;
	}
	
	public static void FindDocbyID(List<Core>cc,int id) {
		boolean found = false;
		for(Core c1:cc) {
			if(c1.getDocid()==id) {
				System.out.println("doctor details are " +c1);
				found=true;
				break;
			}
			}if(!found) {
				System.out.println("doctor details not found");
			}
		}
	
	
	//int docid, String docName, String email, String degree, LocalDate joiningDate, double salary,
	//Department deprtName
	public static Core validateallinputs(int docid,String docName, String email, String degree, String joiningDate, double salary,String deprtName,String password) throws InvalidInputException {
		LocalDate l = parseValidateDate(joiningDate);
		Department d= validateDepartment(deprtName);
		 parseandvalidateEmail(email, password);
		return new Core(docid,docName,email,degree,l,salary,d,password);
	
}
}