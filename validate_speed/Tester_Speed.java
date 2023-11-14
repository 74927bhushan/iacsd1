package validate_speed;
import validate_speed.SpeedOutofRangeException;
import  static validate_speed.ValidateSpeed.validateSpeed;

import java.util.Scanner;

public class Tester_Speed {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("PLEASE ENTER THE SPEED OF THE VEHICLE ");
			validateSpeed(sc.nextInt());
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
				

	}

}
