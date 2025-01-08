package com.test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency_Of_Each_Character_In_String {

	public static void main(String[] args) {
		String str = "this is to check the frequency of characters in a string";

		Map<Character, Integer> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(i -> 1)));

		System.out.println(map);
	}

}
