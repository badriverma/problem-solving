package array_programs;

import java.util.Arrays;

public class MissingNumberBetweenTwoArray {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 3, 1, 5};
        
        int missingNumber = findMissingNumber(array1,array2);
        System.out.println(missingNumber);
	}

	private static int findMissingNumber(int[] array1, int[] array2) {
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		for (int i = 0; i < array1.length; i++) {
			if(array1[i] != array2[i]) {
				return array1[i];
			}
		}
		return array1[array1.length-1];
	}
}
