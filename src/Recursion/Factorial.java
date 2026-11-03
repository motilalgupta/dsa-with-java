package Recursion;

public class Factorial {
	public static void main(String [] args) {
		int n = 5;
		int res = factorialNum(n);
		System.out.println("Factorial of "+n+" is: "+res);
	}
	public static int factorialNum(int n) {
		
		if(n == 1 || n == 0) {
			return 1;
		}
		
		return n * factorialNum(n-1);
	}
}
