package com.test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "Pavan";
		String s2 = "NaaVp";

		String s1_alt = Stream.of(s1.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
		String s2_alt = Stream.of(s2.toLowerCase().split("")).sorted().collect(Collectors.joining());

		System.out.println(s1_alt.equals(s2_alt) ? "Anagram" : "Not-Anagram");
	}

}
