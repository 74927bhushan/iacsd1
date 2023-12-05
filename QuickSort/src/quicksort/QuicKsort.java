package quicksort;

public class QuicKsort {

	public static void quicksort(int[]arr,int left,int right) {
		if(left>=right) //that means the array is empty.
		{
			return;
		}
//now setting up the pivot location
		int pivotlocation = partition(arr,left,right);
	// calling method recursively 
		quicksort(arr,left,pivotlocation-1); //recursively sorting elements smaller than pivot
		quicksort(arr,pivotlocation+1,right);//recursively sorting elements greater than pivot;
	}
	
	//creating a method partition 
	private static int partition(int []arr,int left,int right) {
		int pivot = arr[left];
		
		while(left<right) {
			// move the right pointer to the left and finding the element smaller than pivot;
			while(arr[right]>pivot && left < right) {
				right--;
			}
			if(left<right) {
				arr[left]=arr[right];
				left++;
			}
		while(arr[left]<pivot &&left<right) {
			left++;
		}
			if(left<right) {
				arr[right]=arr[left];
				right--;
			}
		}
		arr[left]=pivot; //place the pivot in its correct sorted position;
		return right;
	}
}
