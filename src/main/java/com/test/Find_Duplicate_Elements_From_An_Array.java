package com.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Find_Duplicate_Elements_From_An_Array {

	public static void main(String[] args) {
		List<Integer> l = List.of(22, 12, 13, 89, 74, 65, 3, 0, 1, 5, 65, 1, 1, 2, 0, 44, 47, 85, 25, 30, 12, 13, 69,
				96);

		Set<Integer> set = new HashSet<>();

		System.out.println(l.stream().filter(i -> !set.add(i)).collect(Collectors.toSet()));

	}

}
