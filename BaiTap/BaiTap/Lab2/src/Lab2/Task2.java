package Lab2;

public class Task2 {
	public static void main(String[] args) {
        int n = 5; // number of rows
        drawPyramid(n);
    }

    static void drawPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
