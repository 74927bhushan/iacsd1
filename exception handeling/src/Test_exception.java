
public class Test_exception {

	public static void main(String[] args) {
		try {
			int[] myNumbers = {1,2,3};
			System.out.println(myNumbers[10]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index is out of limits");
			e.printStackTrace();
			
		}

	}

}
