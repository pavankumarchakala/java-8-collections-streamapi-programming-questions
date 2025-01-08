package com.test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Join_List_Of_Strings_With_Prefix_Suffix_And_Delimiter {

	public static void main(String[] args) {
		String str = "this is a test string";

		System.out.println(Stream.of(str.split(" ")).collect(Collectors.joining("-", "TestPrefix=>", "<=TestSuffix")));
	}

}
