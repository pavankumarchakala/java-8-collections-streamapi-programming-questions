package com.test;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		System.out.println(solution("abbabba"));
		System.out.println(solution("codility"));
		System.out.println(solution("nitin"));

	}

	public static int solution(String s) {

		List<String> prefixes = new ArrayList<>();
		List<String> suffixes = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			prefixes.add(s.substring(0, i));
			suffixes.add(s.substring(s.length() - i, s.length()));
		}

//		System.out.println(prefixes);
//		System.out.println(suffixes);

		prefixes.retainAll(suffixes);

//		if ()
		return prefixes.stream().map(String::length).max(Integer::compare).orElse(0);

//		return 0;

	}

}
