package com.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Separate_Even_Odd_Numbers {

	public static void main(String[] args) {
		List<Integer> integers = List.of(22, 12, 13, 89, 74, 65, 3, 0, 1, 5, 65);
		Map<Boolean, List<Integer>> map = integers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
		System.out.println(map);
	}

}
