package com.test;

import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {
		String str = "pavap";

		System.out.println("Is " + str + " a Palindrome: "
				+ IntStream.range(0, str.length()).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - 1 - i)));
	}

}
