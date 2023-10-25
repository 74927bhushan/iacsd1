package exception_handling;

public class ArithmExc {
	

	public static void main(String[] args)
	{
		 try {
			 int a = 10;
			 int b = 0;
			 System.out.println("div " + ( a / b ));
			 
		 }
		 catch(ArithmeticException e){
			 
			
			
			 System.out.println("divide by zero exception");
			 
		 }

	}

}
