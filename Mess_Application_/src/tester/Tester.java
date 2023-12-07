package tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import exceptions.InvalidInputException;

import  static validations.Validations.validateallinput;
import mess_Core.Mess_Core;
import validations.Validations;

public class Tester {

	public static void main(String[] args) {
		
		Map<Integer,Mess_Core> custdata = new HashMap<>();

		try(Scanner sc = new Scanner(System.in)){
			int choice=0;
			do {
				System.out.println("1.add customer 2.display");
				choice = sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("enter id,first-name,lname,email,amount,plan,registration-date");
					int key=sc.nextInt();
					Mess_Core ca=validateallinput(key,sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next());
					
					custdata.put(key, ca);
					
				System.out.println("sucess");
					break;
				case 2:
					System.out.println(custdata);
					break;
				}
			}while(choice!=0);
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
//(int custid, String f_Name, String l_Name, String email, double amount, Plan messplan,
		//	LocalDate reg_Date)