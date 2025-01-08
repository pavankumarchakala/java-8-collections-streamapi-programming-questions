package com.test;

import java.util.Comparator;
import java.util.List;

public class N_Max_And_Min_Numbers_From_The_List {

	public static void main(String[] args) {

		int n = 2;

		List<Integer> integers = List.of(22, 12, 13, 89, 74, 65, 3, 0, 1, 5, 65, 1, 1, 2, 0, 44, 47, 85, 25, 30, 12, 13,
				69, 96);

		System.out.println("N - Min numbers:");
		integers.stream().sorted(Comparator.naturalOrder()).limit(n).forEach(System.out::println);
		System.out.println("N - Max numbers:");
		integers.stream().sorted(Comparator.reverseOrder()).limit(n).forEach(System.out::println);

	}

}
