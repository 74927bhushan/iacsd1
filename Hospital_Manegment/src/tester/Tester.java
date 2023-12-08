package tester;

import static validations.Validations.parseValidateDate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import Exceptions.InvalidInputException;
import core.Core;

public class Tester {

	public static void main(String args[]) {
//		String date="1999-01-01";
//		try {
//			LocalDate d1=parseValidateDate(date);
//		} catch (InvalidInputException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Core> cc = new ArrayList<>();
			boolean status = false;
			while (!status) {
				try {
					System.out.println("1.add doc" +" "+ "2.display doc" +" "+ "3.sort doc according to id" + " "+ " 4.Find DOCTOR by id");
					switch (sc.nextInt()) {
					case 1:
////int docid, String docName, String email, String degree, LocalDate joiningDate, double salary,
						// Department deprtName
						System.out.println("enter details of the doctor ");
						System.out.println("enter docid,docname,email,degree,joiningdate,salary,department,password");
						Core cs = validations.Validations.validateallinputs(sc.nextInt(), sc.next(), sc.next(),
								sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next());
						cc.add(cs);
						break;

					case 2:
						System.out.println("List of doctors are");

						for (Core core : cc) {
							System.out.println(core);
						}
						break;
					case 3:
						System.out.println("sorted list is");
						Collections.sort(cc);
						System.out.print(cc);
						break;
					case 4:
						System.out.println("enter the Doctorid ");
						int ID =sc.nextInt();
						validations.Validations.FindDocbyID(cc,ID);
						
						
						
						break;
						default:
					}
				} catch (Exception e) {
					System.out.println();
					e.printStackTrace();
				}
			}
		}

	}
}