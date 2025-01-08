package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Java8CollectionsStreamapiProgrammingQuestionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java8CollectionsStreamapiProgrammingQuestionsApplication.class, args);
	}

	// Java 8 Programming
	@EventListener(value = ApplicationReadyEvent.class)
	public void testing() {

		countOccurenceOfEachCharacterInaString();
		duplicateOccurencesOfEachCharacterInaString();
		uniqueOccurencesOfEachCharacterInaString();
		duplicateOccurencesOfEachCharacterInaString_ORDERED();
		uniqueOccurencesOfEachCharacterInaString_ORDERED();
		firstRepeatingCharacterInaString();
		firstNonRepeatingCharacterInaString();
		nthRepeatingCharacterInaString(2);
		nthNonRepeatingCharacterInaString(2);
		nthHighestSalary(1);
		nthLowestSalary(1);
		nthLongestSubString(4);

	}

	// Java 8 Stream API and Collections
	@EventListener(value = ApplicationReadyEvent.class)
	public void testing2() {

		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

		List<Integer> duplicateNumbers = List.of(1, 1, 1, 3, 3, 2, 2, 2, 8, 5, 0);

		List<String> names = Arrays.asList(null, null, "Honey", null, "Bujji", "Gokul", "Chinnu", "Laddu", null,
				"Sweety");

		// 1. Stream::ofNullable
		System.out.println("Stream::ofNullable:");
		System.out.println(names.parallelStream().flatMap(Stream::ofNullable).toList());
		System.out.println();
		System.out.println();
		// 2. Stream.iterate
		System.out.println("Stream.iterate:");
		Stream.iterate(0, n -> n + 1).limit(10).forEach(System.out::print);
		System.out.println();
		System.out.println();
		// 3. Collectors.collectingAndThen
		System.out.println("Collectors.collectingAndThen:");
		System.out.println(numbers.parallelStream().mapToDouble(Integer::intValue).boxed()
				.collect(Collectors.collectingAndThen(Collectors.averagingDouble(Double::doubleValue), Math::round)));
		System.out.println();
		System.out.println();
		// 4. Stream.takeWhile //5.Stream.dropWhile
		System.out.println("Stream.takeWhile & Stream.dropWhile:");
		System.out.println(numbers.stream().takeWhile(num -> num < 7).dropWhile(num -> num < 4).toList());
		System.out.println();
		System.out.println();
		// 6. Collectors.teeing
		System.out.println("Collectors.teeing:");
		System.out.println(numbers.stream().collect(Collectors.teeing(Collectors.minBy(Integer::compareTo),
				Collectors.maxBy(Integer::compareTo), (e1, e2) -> Map.of("max", e1.get(), "min", e2.get()))));
		System.out.println();
		System.out.println();
		// 6. Stream.concat
		System.out.println("Stream.concat:");
		System.out.println(Stream.concat(Stream.of(1, 2, 3), Stream.of(4, 5, 6)).mapToInt(Integer::intValue).sum());
		System.out.println();
		System.out.println();
		// 7. Collectors.partitioningBy
		System.out.println("Collectors.partitioningBy:");
		System.out.println(numbers.parallelStream().collect(Collectors.partitioningBy(item -> item % 2 == 0)));
		System.out.println();
		System.out.println();
		// 8. IntStream range
		System.out.println("IntStream range:");
		System.out.println(IntStream.range(1, 20).boxed().toList());
		System.out.println(IntStream.rangeClosed(1, 20).boxed().toList());
		System.out.println();
		System.out.println();
		// 9. Collections.nCopies -- Immutable objects
		System.out.println("Collections.nCopies:");
		System.out.println(Collections.nCopies(3, "Testing"));
		System.out.println();
		System.out.println();
		// 10. Collections.frequency
		System.out.println("Collections.frequency:");
		System.out.println(Collections.frequency(List.of(1, 1, 1, 3, 3, 2, 2, 2, 8, 5, 0), 1));
		System.out.println(Collections.frequency(names, null));
		System.out.println(duplicateNumbers.stream()
				.collect(Collectors.toMap(number -> number, number -> Collections.frequency(duplicateNumbers, number),
						(existingValue, newValue) -> existingValue)));
		System.out.println();
		System.out.println();
		// 11. Collections.disjoint - To find if there are any common elements between 2
		// collections
		System.out.println("Collections.disjoint:");
		System.out.println("There are common elements : " + Collections.disjoint(numbers, duplicateNumbers));
		System.out.println("There are common elements : " + Collections.disjoint(numbers, List.of(0, 10)));
		System.out.println();
		System.out.println();
		// 12. Collections.singleton
		System.out.println("Collections.singleton:");
		Set<Integer> set = Collections.singleton(1);
		System.out.println(set);
		try {
			set.add(123);
		} catch (Exception e) {
			System.out.println("You cannot modify singleton instance...");
		}
		System.out.println();
		System.out.println();
		// 13. Collections.rotate
		System.out.println("Collections.rotate:");
		List<Integer> copy1 = new ArrayList<>(numbers);
		Collections.rotate(copy1, 3);
		System.out.println("Clockwise = " + copy1);
		List<Integer> copy2 = new ArrayList<>(numbers);
		Collections.rotate(copy2, -3);
		System.out.println("Anti-Clockwise = " + copy2);
		System.out.println();
		System.out.println();
	}

	private void countOccurenceOfEachCharacterInaString() {
		System.out.println("Count Occurences of each character ::");
		String str = "pavankumarchakala";
		List<String> list = Arrays.asList(str.split(""));
		// 1st Approach
		System.out.println("1st Approach::");
		System.out.println(list.parallelStream().collect(Collectors.toMap(item -> item,
				item -> Collections.frequency(list, item), (existing, newValue) -> existing)));
		// 2nd Approach
		System.out.println("2nd Approach::");
		System.out.println(
				list.parallelStream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		System.out.println();
		System.out.println();
	}

	private void duplicateOccurencesOfEachCharacterInaString() {
		System.out.println("Duplicate Elements ::");
		String str = "pavankumarchakala";
		List<String> list = Arrays.asList(str.split(""));
		System.out.println(list.parallelStream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().parallelStream()
				.filter(item -> item.getValue() > 1).map(Map.Entry::getKey).toList());
		System.out.println();
		System.out.println();
	}

	private void uniqueOccurencesOfEachCharacterInaString() {
		System.out.println("Unique Elements ::");
		String str = "pavankumarchakala";
		List<String> list = Arrays.asList(str.split(""));
		System.out.println(list.parallelStream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().parallelStream()
				.filter(item -> item.getValue() <= 1).map(Map.Entry::getKey).toList());
		System.out.println();
		System.out.println();
	}

	private void duplicateOccurencesOfEachCharacterInaString_ORDERED() {
		System.out.println("Duplicate Elements in Order ::");
		String str = "pavankumarchakala";
		List<String> list = Arrays.asList(str.split(""));
		System.out.println(list.parallelStream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().parallelStream().filter(item -> item.getValue() > 1).map(Map.Entry::getKey).toList());
		System.out.println();
		System.out.println();
	}

	private void uniqueOccurencesOfEachCharacterInaString_ORDERED() {
		System.out.println("Unique Elements in Order ::");
		String str = "pavankumarchakala";
		List<String> list = Arrays.asList(str.split(""));
		System.out.println(list.parallelStream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().parallelStream().filter(item -> item.getValue() <= 1).map(Map.Entry::getKey).toList());
		System.out.println();
		System.out.println();
	}

	private void firstRepeatingCharacterInaString() {
		System.out.println("First Repeating Character ::");
		String str = "pavankumarchakala";
		List<String> list = Arrays.asList(str.split(""));
		list.parallelStream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().parallelStream().filter(item -> item.getValue() > 1).findFirst()
				.ifPresent(item -> System.out.println(item));
		System.out.println();
		System.out.println();
	}

	private void firstNonRepeatingCharacterInaString() {
		System.out.println("First Non-Repeating Character ::");
		String str = "pavankumarchakala";
		List<String> list = Arrays.asList(str.split(""));
		list.parallelStream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().parallelStream().filter(item -> item.getValue() == 1).findFirst()
				.ifPresent(item -> System.out.println(item));
		System.out.println();
		System.out.println();
	}

	private void nthNonRepeatingCharacterInaString(int i) {
		System.out.println("Nth Non-Repeating Character ::");
		String str = "pavankumarchakala";
		List<String> list = Arrays.asList(str.split(""));
		try {
			System.out.println(list.parallelStream()
					.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
					.entrySet().parallelStream().filter(item -> item.getValue() == 1).toList().get(i - 1));
		} catch (Exception e) {
			System.out.println("There is no " + i + "th element...");
		}
		System.out.println();
		System.out.println();
	}

	private void nthRepeatingCharacterInaString(int i) {
		System.out.println("Nth Repeating Character ::");
		String str = "pavankumarchakala";
		List<String> list = Arrays.asList(str.split(""));
		try {
			System.out.println(list.parallelStream()
					.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
					.entrySet().parallelStream().filter(item -> item.getValue() > 1).toList().get(i - 1));
		} catch (Exception e) {
			System.out.println("There is no " + i + "th element...");
		}
		System.out.println();
		System.out.println();
	}

	private void nthHighestSalary(int i) {
		System.out.println("nth Highest Salary ::");

		Map<String, Integer> map = new HashMap<>();
		map.put("Honey", 1900);
		map.put("Bujji", 1700);
		map.put("Chinnu", 1000);
		map.put("Laddu", 900);
		map.put("Gokul", 700);
		map.put("Sweety", 700);

		System.out.println(map.entrySet().parallelStream()
				.collect(Collectors.groupingBy(Map.Entry::getValue,
						Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
				.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).toList().get(i - 1));

		System.out.println();
		System.out.println();
	}

	private void nthLowestSalary(int i) {
		System.out.println("nth Lowest Salary ::");

		Map<String, Integer> map = new HashMap<>();
		map.put("Honey", 1900);
		map.put("Bujji", 1700);
		map.put("Chinnu", 1000);
		map.put("Laddu", 900);
		map.put("Gokul", 700);
		map.put("Sweety", 700);

		System.out.println(map.entrySet().parallelStream()
				.collect(Collectors.groupingBy(Map.Entry::getValue,
						Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
				.entrySet().stream().sorted(Map.Entry.comparingByKey()).toList().get(i - 1));

		System.out.println();
		System.out.println();

	}

	private void nthLongestSubString(int i) {
		System.out.println("nth Longest Sub-String ::");

		String str = "Very soon, I will be a Billionaire and will buy all the things I want !!!";

		String strArr[] = str.split(" ");
		System.out.println(Arrays.toString(strArr));

		System.out.println("Longest String : " + Arrays.stream(strArr)
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get());
		System.out.println("nth Longest Sub-String : " + Arrays.stream(strArr)
				.sorted(Collections.reverseOrder((str1, str2) -> str1.length() - str2.length())).toList().get(i - 1));

		System.out.println();
		System.out.println();

	}

}
