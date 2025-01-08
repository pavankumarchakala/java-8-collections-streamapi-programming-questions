package com.test;

import java.util.stream.IntStream;

public class Print_Multiples_Of_5_From_The_List {

	public static void main(String[] args) {
		IntStream.rangeClosed(0, 100).filter(i -> i % 5 == 0).forEach(System.out::println);
	}

}
