package bubblesort;

public class Bubblesort {
	
	
	
	public static void sort(int []arr) {
		for(int i =0;i<arr.length-1;i++) {
			for(int j =0;j<arr.length-i-1;j++) 
				
			
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}

	public static void main(String[] args) {
		
		int [] arr = {12,23,45,32,43,12,32,67,19,31};
        sort(arr);
		
        System.out.println("sorted array");
        for(int a : arr) {
        	System.out.print(a + "  ");
        }
	}

}
