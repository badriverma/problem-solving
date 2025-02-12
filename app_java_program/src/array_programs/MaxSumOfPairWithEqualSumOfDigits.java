package array_programs;

import java.util.HashMap;
import java.util.Map;

public class MaxSumOfPairWithEqualSumOfDigits {
	
	public static void main(String[] args) {
		 System.out.println(maximumSum(new int[]{18, 43, 36, 13, 7})); // Output: 54
	     System.out.println(maximumSum(new int[]{10, 12, 19, 14})); 
	}

	private static int maximumSum(int[] nums) {
		Map<Integer, Integer> mapSum = new HashMap<Integer, Integer>();
		int maxSum = -1;
		
		for (int num : nums) {
			int digits = sumOfDigits(num);
			if(mapSum.containsKey(digits)) {
				maxSum = Math.max(maxSum, mapSum.get(digits)+num);
				mapSum.put(digits, Math.max(mapSum.get(digits),num));
			}else {
				mapSum.put(digits, num);
			}
		}
		
		return maxSum;
	}

	private static int sumOfDigits(int num) {
		int sum = 0;
		while(num>0) {
			sum += num%10;
			num/=10;
		}
		return sum;
	}

}
