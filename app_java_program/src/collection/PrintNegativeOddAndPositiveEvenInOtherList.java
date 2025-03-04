package collection;

import java.util.*;
import java.util.stream.Collectors;

public class PrintNegativeOddAndPositiveEvenInOtherList {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,-2,3,-4,5,6,7,8,-9,10);
		
		System.out.println("First List");
		asList.stream().filter(e-> e<0 ||e%2!=0).collect(Collectors.toList())
		.forEach(e->System.out.print(e+" "));
		
		System.out.println("\nSecond List");
		asList.stream().filter(e-> e>0 && e%2==0).collect(Collectors.toList())
		.forEach(e->System.out.print(e+" "));
	}
}
