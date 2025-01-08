package com.test;

import java.util.Comparator;
import java.util.List;

public class Maximum_And_Minimum_In_List {

	public static void main(String[] args) {
		List<Integer> integers = List.of(22, 12, 13, 89, 74, 65, 3, 0, 1, 5, 65);
		System.out.println("Max: " + integers.stream().max(Comparator.naturalOrder()).get());
		System.out.println("Min: " + integers.stream().min(Comparator.naturalOrder()).get());
		System.out.println("Max: " + integers.stream().max(Comparator.reverseOrder()).get());
		System.out.println("Min: " + integers.stream().min(Comparator.reverseOrder()).get());
	}

}
