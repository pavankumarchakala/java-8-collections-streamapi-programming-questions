package com.test;

import java.util.List;

public class Sum_And_Average_Of_All_Elements_Of_An_Array {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(22, 12, 13, 89, 74, 65, 3, 0, 1, 5, 65, 1, 1, 2, 0, 44, 47, 85, 25, 30, 12, 13,
				69, 96);

		System.out.println("Sum: " + list1.stream().mapToInt(i -> (int) i).sum());
		System.out.println("Average: " + list1.stream().mapToInt(i -> (int) i).average().getAsDouble());
	}

}
