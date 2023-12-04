package binaryserch;

public class Runner {

	
	    public static void main(String[] args) {

		int [] arr = {10,20,30,40,50,60,70};
		
		 System.out.println("key: 10: " + Binaryserch1.binaryserch(arr, 10));
	        System.out.println("key: 50: " + Binaryserch1.binaryserch(arr, 50));
	        System.out.println("key: 80: " + Binaryserch1.binaryserch(arr, 80));
	        System.out.println("key: 100: " +Binaryserch1.binaryserch(arr, 100));
	        System.out.println("key: 110: " + Binaryserch1.binaryserch(arr, 110));
	        System.out.println();
	
	        
	        System.out.println("key: 10: " + Binaryserch1.binaryserch(arr, 0, arr.length-1, 10));
	        System.out.println("key: 50: " + Binaryserch1.binaryserch(arr, 0, arr.length-1, 50));
	        System.out.println("key: 80: " + Binaryserch1.binaryserch(arr, 0, arr.length-1,80));
	        System.out.println("key: 100: " + Binaryserch1.binaryserch(arr, 0, arr.length-1,100));
	        System.out.println("key: 110: " + Binaryserch1.binaryserch(arr, 0, arr.length-1,110));

	    }

}



