package collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddTwoListWithOutDuplicateNumber {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(3, 4, 5);
		
		List<Integer> collect = Stream.concat(list1.stream(), list2.stream())
								.distinct().collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
