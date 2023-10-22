package Lab3;

public class MyArray {
	int[] arr;
	public MyArray(int[] array) {
	this.arr = arr;
	}
	public static int iterativeLinearSearch(int[] arr,int target) {
		for (int i=0; i<arr.length-1; i++) {
			if(arr[i] == target) 
			return i; 
			}
			return -1;
	}
	public static int recursiveLinearSearch(int[] arr,int target, int index) {
	    if (index >= arr.length) {
	        return -1;
	    } else if (arr[index] == target) {
	        return index;
	    } else {
	        return recursiveLinearSearch(arr, target, index + 1);
	    }
	}
	public static int iterativeBinarySearch(int[] arr,int target) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(target == arr[mid]) {
				return mid;
			}
			else if (target <= arr[mid]) {
				high = mid -1;
			}
			else low= mid +1;
		}
	return -1;
	}
	public static int recursiveBinarySearch(int[] arr,int target,int low,int high) {
		if(low>high) {
			return -1;
		}
		int mid = (low+high)/2;
		if(target == arr[mid]) {
			return mid;
		}
		else if (target <= arr[mid]) {
			return recursiveBinarySearch(arr, target, low, mid - 1);
		}
		return recursiveBinarySearch(arr, target, mid + 1, high);
	}
	public static void main(String[] args) {
		 int[] array = {12, 10, 9, 45, 2, 10, 10, 45};
		 int[] sArray = {2, 9, 10, 10, 10, 12, 45, 45};
		 MyArray m1= new MyArray(array);
		System.out.println(iterativeLinearSearch(array, 45));
		System.out.println(recursiveLinearSearch(array, 2, 0));
		System.out.println(iterativeBinarySearch(sArray, 12));
		System.out.println(recursiveBinarySearch(sArray, 45, 0, sArray.length));
	}
}
