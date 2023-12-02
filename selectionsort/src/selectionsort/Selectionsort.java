package selectionsort;

public class Selectionsort {

	
 public static void sort(int arr[]) {
	 //outer for-loop is for iterating through each element 
	 for(int i=0;i<arr.length-1;i++) {
//minimum index is set to i;
		 int min=i;
//inner for loop starts from the element next to the current i
//this finds the next minimum index among the remaining elements
		 
		 for(int j=i+1;j<arr.length;j++) {
//while iterating if we found minimum element then that element is assigned value j
			 if(arr[j]<arr[min]) {
				 	min=j;
			 }
		 } 
		//here we do swapping for i and j and update the minimum and repeat.
			 int temp=arr[min];
				 arr[min]=arr[i];
				 arr[i]=temp; 
			 }
		 }
	 
 
 
 public static void main(String args[]) {
	 
	 int [] arr= {56,23,43,10,24,76,98,89};
	 sort(arr);
	 
	 for( int a:arr) {
		 System.out.print(a+" ");
	 }
 }
}
