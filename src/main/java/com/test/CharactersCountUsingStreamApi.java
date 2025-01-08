package com.test;

import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactersCountUsingStreamApi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(new InputStreamReader(System.in));

		String s = sc.nextLine();
		Map<Character, Integer> map = s.replaceAll(" ", "").chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(i -> 1)));

		System.out.println(map);

		sc.close();
	}

}
