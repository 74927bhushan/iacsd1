import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int []arr={23,45,12,34,5,66,7,89,90};
		
		System.out.println("original array" +Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("sorted array "+ Arrays.toString(arr));

	}

}
