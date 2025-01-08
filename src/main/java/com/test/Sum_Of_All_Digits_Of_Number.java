package com.test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sum_Of_All_Digits_Of_Number {

	public static void main(String[] args) {

		int n = 123456789;

		System.out.println(Stream.of(String.valueOf(n).split("")).collect(Collectors.summingInt(Integer::parseInt)));
	}

}
