package Lab5;

public class Task1 {
	public static int[][] add(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}

	public static int[][] subtract(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = a[i][j] - b[i][j];
			}
		}
		return c;
	}

	// multiply 2 matrices
	public static int[][] multiply(int[][] a, int[][] b) {
		int[][] c = new int[a[0].length][b.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < b[0].length; k++) {
					c[i][j] += a[i][k]*b[j][k];
				}
			}
		}
		return c;

	}

	// tranpose a matrix
	public static int[][] transpose(int[][] C) {
	    int m = C.length, n = C[0].length;
	    int[][] D = new int[n][m];
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            D[j][i] = C[i][j];
	        }
	    }
	    return D;
	}

}
