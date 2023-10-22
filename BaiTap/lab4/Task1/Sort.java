package Task1;

import java.util.Arrays;

public class Sort {
	private static void swap(int[] a, int i, int j) {
		int b = a[i];
		a[i] = a[j];
		a[j] = b;
	}
	public static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[j] > arr[i]) {
	            	swap(arr, i, j);
	            }
	        }
	    }
		return arr;
		}
	public static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if(array[j] < array[j+1]) {
					swap(array, j, j+1);
				}
			}
		}
		return array;
		}
	public static int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int b = array[i];
			int j = i ;
			while (j>0 && array[j-1] < b) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = b;
		}
		return array;
		}

	public static void main(String[] args) {
		int[] arr =  {1,3,7,2,4,9,6};
		System.out.println(Arrays.toString(selectionSort(arr)));
		System.out.println(Arrays.toString(bubbleSort(arr)));
		System.out.println(Arrays.toString(insertionSort(arr)));
	}
}
