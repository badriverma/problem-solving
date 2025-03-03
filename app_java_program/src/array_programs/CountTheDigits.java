package array_programs;

import java.util.Scanner;

public class CountTheDigits {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the numbers");
		int nums = scan.nextInt();
		
		int count=0;
		while(nums>0) {
			count++;
			nums/=10;
		}
		
		System.out.println("Digit are : "+count);
	}
}
