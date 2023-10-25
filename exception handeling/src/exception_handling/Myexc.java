package exception_handling;

public class Myexc {

	public static void main(String[] args) {
		
		try {
			parse("nb1234");
			System.out.println("end of try");
		}
		catch(Exception e) {
			System.out.println("in catch block");
			System.out.println(e);
		}
		finally {
			System.out.println("in finally block");
		}


	}

	 static void parse(String s) throws InterruptedException {
		 System.out.println("in parse method");
		 try {
		System.out.println("parse it"+Integer.parseInt(s));
		
		}
			finally {
				System.out.println("in parse methods finally");
			}
		 
				 
		
	}

	

}
