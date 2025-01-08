package com.test;

import java.util.stream.IntStream;

public class Sum_Of_First_N_Natural_Numbers {

	public static void main(String[] args) {
		System.out.println(IntStream.rangeClosed(1, 13).sum());
	}

}
