package array_programs;

import java.util.Arrays;

public class FindMissingNumberFromTwoArray {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3,4, 1, 5};
        
        int missingNumber  = findMissingNumber(arr1,arr2);
        System.out.println("Missing number is : "+missingNumber);
	}

	private static int findMissingNumber(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i]!=arr2[i]) {
				return arr1[i];
			}
		}
		
		return arr1[arr1.length-1];
	}
}
