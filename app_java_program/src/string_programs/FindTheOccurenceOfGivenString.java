package string_programs;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheOccurenceOfGivenString {

	public static void main(String[] args) {
		String str = "badriprasadverma";
		
		//type 1
		Map<Character, Long> collect = str.chars().mapToObj(c-> (char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		//type2
		Map<String, Long> collect2 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));
		System.out.println(collect2);

	}
}
