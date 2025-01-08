package com.test;

import java.util.Comparator;
import java.util.List;

public class Sort_The_List_In_Reverse_Order {

	public static void main(String[] args) {
		List<Integer> integers = List.of(22, 12, 13, 89, 74, 65, 3, 0, 1, 5, 65);
		System.out.println("Descending Order:" + integers.stream().sorted(Comparator.reverseOrder()).toList());
		System.out.println("Ascending Order:" + integers.stream().sorted().toList());
	}

}
