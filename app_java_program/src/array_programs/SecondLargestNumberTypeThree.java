package array_programs;

import java.util.Arrays;

public class SecondLargestNumberTypeThree {

	public static void main(String[] args) {
		int[] arr = {65,23,76,34,87,22,98,45};
		
		Arrays.sort(arr);
		
		Integer integer = Arrays.stream(arr).boxed().sorted((a,b) ->b-a).
				skip(1).findFirst().get();
		System.out.println(integer);
	}
}
