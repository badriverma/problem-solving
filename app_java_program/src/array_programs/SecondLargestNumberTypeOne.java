package array_programs;

import java.util.Arrays;

public class SecondLargestNumberTypeOne {

	public static void main(String[] args) {
		int[] arr = {65,23,76,34,87,22,98,45};
		
		Arrays.sort(arr);
		
		int num = arr.length;
		
		if(num>=2) {
			System.out.println(arr[num-2]);
		}else {
			System.out.println("Invalid Index");
		}
		
	}
}
