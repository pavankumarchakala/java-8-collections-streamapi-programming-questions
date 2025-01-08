package com.test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Find_Strings_Which_Start_With_Number {

	public static void main(String[] args) {
		System.out.println(Stream.of("asd", "qwe", "123ghj", "0bnm", "bgt")
				.filter(item -> Character.isDigit(item.charAt(0))).collect(Collectors.joining(",")));
	}

}
