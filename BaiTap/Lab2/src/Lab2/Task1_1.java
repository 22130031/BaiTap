package Lab2;

public class Task1_1 {
	public static int getSn1(int n) {
		if (n==1) {
		return 1;
		}
		else
		return (int) (getSn1(n-1) + Math.pow(-1, n+1)*n);
		}
	public static int getSn2(int n) {
		if (n==1)
			return 1;
		else return getSn2(n-1) + factorial(n);
	}
	public static int getSn3(int n) {
		if (n==1)
			return 1;
		else return (int) (getSn3(n-1) + Math.pow(n, 2));
	}
	public static double getSn4(int n) {
		if (n==1)
			return 1;
		else return (getSn4(n-1) + 1/(factorial(n)*Math.pow(2, n)));
	}
	public static int factorial(int n) {
		if (n==0)
		return 1;
		else return n*factorial(n-1);
	}
	public static void main(String[] args) {
		System.out.println(getSn1(5)+"");
		System.out.println(getSn2(5));
		System.out.println(getSn3(5));
		System.out.println(getSn4(5));
	}
}
