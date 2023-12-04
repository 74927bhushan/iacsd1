package binaryserch;

public class Binaryserch1 {

	public static int binaryserch(int [] arr,int key) {
		int low=0;
		int high = arr.length-1;
		int mid;
		
		
		
		while(low<=high) {
			mid = (low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(key < arr[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}
	
	public static int binaryserch(int []arr,int low,int high,int key) {
		if(low>high) {
			return -1;
		}
		int mid=(low+high)/2;
		if(arr[mid]==key) {
			return mid;
		}
		if(key<arr[mid]) {
			return binaryserch(arr,low,mid-1,key);
		}
		else {
			return binaryserch(arr,mid+1,high,key);
		}
	}
}
