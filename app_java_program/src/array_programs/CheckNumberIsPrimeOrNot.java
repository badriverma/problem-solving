package array_programs;

import java.util.Scanner;

public class CheckNumberIsPrimeOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scan.nextInt();
		
		if(isNumPrime(num)) {
			System.out.println("Number is prime");
		}else {
			System.out.println("not prime");
		}
	}

	private static boolean isNumPrime(int num) {
		if(num<=0) {
			return false;
		}
		for (int i = 2; i <=Math.sqrt(num); i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}

}
