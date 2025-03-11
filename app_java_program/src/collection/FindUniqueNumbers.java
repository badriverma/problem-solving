package collection;

import java.util.*;

public class FindUniqueNumbers {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,3,4,1);
		System.out.println("Unique Number");
		printUniueNumbers(asList);
	}

	private static void printUniueNumbers(List<Integer> asList) {
		Set<Integer> set = new HashSet<Integer>();
		
		for (Integer integer : asList) {
			if(!set.contains(integer)) {
				System.out.println(integer+" ");
				set.add(integer);
			}
		}
		
	}
}
