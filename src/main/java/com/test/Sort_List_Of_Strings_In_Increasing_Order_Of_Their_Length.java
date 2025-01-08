package com.test;

import java.util.Comparator;
import java.util.stream.Stream;

public class Sort_List_Of_Strings_In_Increasing_Order_Of_Their_Length {

	public static void main(String[] args) {
		String str = "this is to check the frequency of characters in a string";

		System.out.println(Stream.of(str.split(" ")).sorted((i1, i2) -> i1.length() - i2.length()).toList());
		System.out.println(Stream.of(str.split(" ")).sorted(Comparator.comparing(String::length)).toList());
	}

}
