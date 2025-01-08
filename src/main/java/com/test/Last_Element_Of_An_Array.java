package com.test;

import java.util.List;

public class Last_Element_Of_An_Array {

	public static void main(String[] args) {
		List<Integer> l = List.of(22, 12, 13, 89, 74, 65, 3, 0, 1, 5, 65, 1, 1, 2, 0, 44, 47, 85, 25, 30, 12, 13, 69,
				96);

		System.out.println("Last Element Of an array : " + l.stream().skip(l.size() - 1).findFirst().get());
	}

}
