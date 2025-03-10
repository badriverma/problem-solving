package string_programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheOccurenceOfGivenString {

	public static void main(String[] args) {
		String str = "badriprasadverma";
		
		//Type 1
		Map<Character, Long> collect = str.chars().mapToObj(c-> (char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		//Type2
		Map<String, Long> collect2 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));
		System.out.println(collect2);
		
		//Type 3
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for (Entry<Character, Integer> string : map.entrySet()) {
			System.out.println(string);
		}
	}
}
