package insertionsort;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {12,32,11,43,23,56,34};
		
		Insertionsort.insertionSort(arr);
		for(int a:arr) {
			System.out.println(a);
		}
		
		 
	}
	public static void insertionSort(int [] arr) {
		
//1st iteration i=0; 
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
