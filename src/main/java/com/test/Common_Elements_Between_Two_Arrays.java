package com.test;

import java.util.List;
import java.util.stream.Collectors;

public class Common_Elements_Between_Two_Arrays {

	public static void main(String[] args) {

		List<Integer> list1 = List.of(22, 12, 13, 89, 74, 65, 3, 0, 1, 5, 65, 1, 1, 2, 0, 44, 47, 85, 25, 30, 12, 13,
				69, 96);

		List<Integer> list2 = List.of(22, 12);

		System.out
				.println(list1.stream().filter(list2::contains).map(String::valueOf).collect(Collectors.joining(",")));

	}
}
