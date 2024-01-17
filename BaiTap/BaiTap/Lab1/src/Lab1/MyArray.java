package Lab1;

import java.util.Arrays;
import java.util.Iterator;

import javax.swing.Box.Filler;

public class MyArray {
	private int[] array;
    public  int[] mirror() {
        int[] mirrored = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            mirrored[i] = array[i];
            mirrored[mirrored.length - 1 - i] = array[i];
        }
        return mirrored;
    }
    public  int[] removeDuplicates() {
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
    public int [] getMissingValue() {
    	int[] missingValue = new int [3];
    	for (int i = 0; i < array.length; i++) {
			if(array[i]!= array[i+1] +1) {
				Arrays.fill(missingValue, array[i] + 1);
			}
		}
		return missingValue;
    }
    
    public int[] fillMissingValue(int k) {
    	for (int i = 0; i < array.length; i++) {
			if(array[i] == -1) {
				array[i] = array[k];
			}
		}
		return array;
    	
    }
}