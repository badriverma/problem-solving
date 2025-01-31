package array_programs;

import java.util.Arrays;

public class FindTheSumOfClosestTarget {

	public static void main(String[] args) {
		int[] arr = {0,0,0,0};
        int target1 = 1;
        System.out.println(threeSumClosest(arr, target1));  // Output: 2
		
	}

	private static int threeSumClosest(int[] arr, int target1) {
		Arrays.sort(arr);
		int closestSum = arr[0] + arr[1] +arr[2];
		
		for (int i = 0; i < arr.length-2; i++) {
			
			int left = i+1, right = arr.length-1;
			
			while(left<right) {
				int sum = arr[i] + arr[left] + arr[right];
				
				if(Math.abs(target1-sum) < Math.abs(target1-closestSum)) {
					closestSum=sum;
				}
				
				if(sum<target1) {
					left++;
				}else if(sum>target1) {
					right--;
				}else {
					return sum;
				}
			}
		}
		
		return closestSum;
	}
}
