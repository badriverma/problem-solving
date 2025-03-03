package string_programs;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheMaximumCharFromString {

	public static void main(String[] args) {
		String str="badriprasadverma"; //output : a=4
		
		Entry<Character, Long> entry = str.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		
		System.out.println(entry);
	}

}
