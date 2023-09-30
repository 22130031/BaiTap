package Task1;

import java.util.Iterator;

public class MyArray {
    public static int[] mirror(int[] array) {
        int[] mirrored = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            mirrored[i] = array[i];
            mirrored[mirrored.length - 1 - i] = array[i];
        }
        return mirrored;
    }
    public static int[] removeDuplicates(int[] array) {
    	int n = array.length;
    	for (int i = 0; i < array.length; i++) {
    		for (int j = 0; j < array.length-1; j++) {
				if(array[i] == array[j]) {
					array[j] = array[j++];
					return array;
				}
				
			}
			
		}
		return array;
    }
    public static void print(int[] arr) {
 	   for (int i = 0; i < arr.length; i++) {
 		System.out.println(arr[i]);
 	}
    }
    public static void main(String[] args) {
    	int [] arr = {1,7,9,6};
    	int [] arr1 = {1,2,3,4,1,7,2,7};
    	print(mirror(arr));
    	print(removeDuplicates(arr1));
	}

}