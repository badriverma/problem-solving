package array_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNumberTripleSumZero {

	public static void main(String[] args) {
		
		int[] arr = {-1,0,1,2,-1,-4};
		
		List<List<Integer>> trippleSum = findNumberOftrippleSumZero(arr);
		for (List<Integer> list : trippleSum) {
			System.out.println(list);
		}
	}

	private static List<List<Integer>> findNumberOftrippleSumZero(int[] arr) {
		List<List<Integer>> tripple = new ArrayList<List<Integer>>();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						tripple.add(Arrays.asList(i,j,k));
					}
				}
			}
		}
		
		return tripple;
	}
}
