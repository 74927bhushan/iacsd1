package quicksort;

public class Runner {

	public static void main(String[] args) {
		
		  int [] arr = {40, 30, 12, 9, 5, 19, 80, 60, 23, 45, 39};
		  
		  QuicKsort.quicksort(arr, 0, arr.length-1);
		  
		  for(int val : arr) {
			  System.out.println(val + " ");
		  }

		  System.out.println();
	}

}
