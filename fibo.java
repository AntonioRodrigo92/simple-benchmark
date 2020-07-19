package coisas;

public class fibo {
	public static long fibonacciRecu (int n) {
		if (n < 2) {
			return n;
		}
		else {
			return fibonacciRecu(n - 2) + fibonacciRecu (n - 1);
		}
	}
	
	
	public static long fibonacciSoma (int n) {
		long a = 0;
		long b = 1;
		long c = 0;
		if (n < 2) {
			return n;
		}
		else {
			for (int i = 2; i <= n; i++) {
				c =  a + b;
				a = b;
				b = c;
			}
			return c;
		}
	}
}
