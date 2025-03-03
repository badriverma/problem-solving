package array_programs;

import java.util.Scanner;

public class FindFibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scan.nextInt();
		System.out.println("Fibonacci series up to " + n + " terms:");	
		
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacciSeries(i)+" ");
		}
	}

	private static int fibonacciSeries(int i) {
		if(i==0) {
			return 0;
		}else if(i==1) {
			return 1;
		}else {
			return fibonacciSeries(i-1)+ fibonacciSeries(i-2);
		}
	}
}
