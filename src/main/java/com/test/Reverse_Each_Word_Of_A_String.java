package com.test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reverse_Each_Word_Of_A_String {

	public static void main(String[] args) {
		String str = "this is to check the frequency of characters in a string";

		System.out.println(
				Stream.of(str.split(" ")).map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining(" ")));

	}

}
