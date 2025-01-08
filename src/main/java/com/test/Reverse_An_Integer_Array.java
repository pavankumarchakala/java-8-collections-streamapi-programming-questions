package com.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Reverse_An_Integer_Array {

	public static void main(String[] args) {
		int[] list1 = { 22, 12, 13, 89, 74, 65, 3, 0, 1, 5, 65, 1, 1, 2, 0, 44, 47, 85, 25, 30, 12, 13, 69, 96 };

		System.out.println("Array: " + Arrays.toString(list1));
		System.out.println("Reverse Array: " + Arrays
				.toString(IntStream.rangeClosed(0, list1.length - 1).map(i -> list1[list1.length - 1 - i]).toArray()));
	}

}
