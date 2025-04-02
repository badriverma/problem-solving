package collection;

import java.lang.reflect.Array;
import java.util.*;

public class FindUniqueNumberFromList {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,3,4,1);
		
		System.out.println("Unique Numbers");
		findUniqueNumber(asList);
		
	}

	private static void findUniqueNumber(List<Integer> asList) {
		Set<Integer> set = new HashSet<Integer>();
		for (Integer integer : asList) {
			if(!set.contains(integer)) {
				System.out.println(integer+" ");
				set.add(integer);
			}
		}
		
	}
}
