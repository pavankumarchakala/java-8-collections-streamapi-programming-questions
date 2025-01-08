package com.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge_Two_Unsorted_Arrays_Into_Single_Sorted_Distinct_Array {

	public static void main(String[] args) {

		int[] arr = IntStream.concat(IntStream.of(22, 12, 13, 89, 74, 65, 3, 0, 1, 5, 65),
				IntStream.of(2, 11, 17, 77, 73, 6, 2, 10, -1, -5, -37)).sorted().distinct().toArray();

		System.out.println(Arrays.toString(arr));
	}

}
