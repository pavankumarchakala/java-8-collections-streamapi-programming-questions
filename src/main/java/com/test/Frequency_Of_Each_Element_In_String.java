package com.test;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency_Of_Each_Element_In_String {

	public static void main(String[] args) {
		String str = "this is to check the frequency of elements in a string. this is again to check the frequency of elements in another string.";

		Map<String, Integer> map = List.of(str.split(" ")).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(i -> 1)));

		System.out.println(map);
//		System.out.println(Runtime.getRuntime().availableProcessors() - 1);
	}

}
