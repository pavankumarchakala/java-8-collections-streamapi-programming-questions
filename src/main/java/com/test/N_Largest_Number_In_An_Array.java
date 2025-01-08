package com.test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class N_Largest_Number_In_An_Array {

	public static void main(String[] args) {

		int n = 6;

		List<Integer> integers = List.of(22, 12, 13, 89, 74, 65, 3, 0, 1, 5, 65, 1, 1, 2, 0, 44, 47, 85, 25, 30, 12, 13,
				69, 96);

		System.out.println(integers.stream().sorted(Comparator.reverseOrder()).map(String::valueOf)
				.collect(Collectors.joining(",")));
		System.out.println(n + "th Largest Element is : "
				+ integers.stream().sorted(Comparator.reverseOrder()).skip(n - 1).findFirst().get());
	}

}
