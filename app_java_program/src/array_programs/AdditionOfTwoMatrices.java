package array_programs;

import java.util.Scanner;

public class AdditionOfTwoMatrices {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the rows and columns");
		int r1 = scan.nextInt();
		int c1 = scan.nextInt();
		System.out.println("Enter the value of matrices 1");
		int[][] arr1 = new int[r1][c1];
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				arr1[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Enter the rows and columns");
		int r2 = scan.nextInt();
		int c2 = scan.nextInt();
		System.out.println("Enter the value of matrices 2");
		int[][] arr2 = new int[r2][c2];
		for (int i = 0; i < r2; i++) {
			for (int j = 0; j < c2; j++) {
				arr2[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Matrices 1");
		printMatxics(arr1);
		System.out.println("Matrices 2");
		printMatxics(arr2);
		System.out.println("Additon Of Matrices1 and Matrices 2");
		addtionOfMatrices(arr1,r1,c1,arr2, r2, c2);
	}

	private static void addtionOfMatrices(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2) {
		if(r1!=r2 || c1!=c2) {
			System.out.println("Additon not happen");
			return;
		}
		
		int[][] sum = new int[r1][c1];
		
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				sum[i][j]= arr1[i][j] + arr2[i][j];
			}
		}
		printMatxics(sum);
	}

	private static void printMatxics(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j< arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
