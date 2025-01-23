package array_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNumberForthSumTarget {

	public static void main(String[] args) {
		
		int[] arr = {2,2,2,2,2};
		int target = 8;
		
		List<List<Integer>> fourth = findFourthSumEqualsTarget(arr,target);
		for (List<Integer> list : fourth) {
			System.out.println(list);
		}
		
	}

	private static List<List<Integer>> findFourthSumEqualsTarget(int[] arr, int target) {
		List<List<Integer>> sum = new ArrayList<List<Integer>>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int k = j+1; k < arr.length; k++) {
					for (int l = k+1; l < arr.length; l++) {
						if(arr[i]+arr[j]+arr[k]+arr[l]==target ) {
							sum.add(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
						}
					}
				}
			}
		}
		return sum;
	}
}
