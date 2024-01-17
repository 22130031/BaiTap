package Lab2;

import java.util.Arrays;

public class Task1_3 {
	public static void printPascalTriangle(int row) {
	}

	public static int[] getPascalTriangle(int n) {
		return null;
	}

	public static int[] generateNextRow(int[] prevRow) {
		int[] nextRow = new int[prevRow.length +1];
		nextRow[0] = 1;
		nextRow[nextRow.length-1]=1;
		for (int i = 1; i < prevRow.length-1; i++) {
			nextRow[i] = prevRow[i-1] + prevRow[i]; 
		}
		return nextRow;
	}
	public static void main(String[] args) {
		int[] arr = {1,3,3,1};
		Arrays.toString(generateNextRow(arr));
	}
}