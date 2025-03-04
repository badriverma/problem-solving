package array_programs;

import java.util.Scanner;

public class MultiplicationOfTwoMatrices {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter row and columns of matrices 1");
		int r1 = scan.nextInt();
		int c1 = scan.nextInt();
		System.out.println("Enter the values of matrices");
		int[][] arr1 =new int[r1][c1];
		
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				arr1[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Enter row and columns of matrices 2");
		int r2 = scan.nextInt();
		int c2 = scan.nextInt();
		System.out.println("Enter the values of matrices");
		int[][] arr2 =new int[r2][c2];
		
		for (int i = 0; i < r2; i++) {
			for (int j = 0; j < c2; j++) {
				arr2[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Matrices 1");
		printMatrices(arr1);
		System.out.println("Matrices 2");
		printMatrices(arr2);
		System.out.println("Multiplication Of Matrices1 and Matrices2");
		multiplicationOfBothMatrices(arr1,r1,c1,arr2,r2,c2);
		
	}

	private static void multiplicationOfBothMatrices(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2) {
		if(r1!=c2) {
			System.out.println("Multiplication can not happened");
		}
		
		int[][] multi =new int[r1][c2];
		
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				for (int k = 0; k < c1; k++) {
					multi[i][j] += arr1[i][k]*arr2[k][j];
				}
			}
		}
		
		printMatrices(multi);
		
	}

	private static void printMatrices(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
