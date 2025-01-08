package com.test;

import java.util.List;

public class Remove_Duplicate_Elements_From_list {

	public static void main(String[] args) {
		List<Integer> integers = List.of(22, 12, 13, 89, 74, 65, 3, 0, 1, 5, 65, 1, 1, 2, 0, 44, 47, 85, 25, 30, 12, 13,
				69, 96);

		System.out.println(integers.stream().distinct().toList());
		System.out.println(integers.stream().distinct().sorted().toList());

	}

}
