package com.streams.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsExample {
	public static void main(String[] args) {
		
		/**
		 * Sum of all numbers between the numbers. rangeClosed() includes the last number
		 * whereas range() does not includes the last number.
		 */
		System.out.println("******Sum of ranged numbers**************");
		int sum1 = IntStream.rangeClosed(1, 5).parallel().sum();
		System.out.println("Declarative : " + sum1);

		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		
		//***********************************************************************************
		System.out.println("******Use of Count() in streams**************");
		/**
		 * Use of Count() in streams
		 */
		long count = strList.stream().filter(x -> x.isEmpty()).count();
		System.out.println(count);

		long num = strList.stream().filter(x -> x.length() > 2).count();
		System.out.println(num);

		//************************************************************************************
			
		System.out.println("\n******collect() in streams**************\n");
		/**
		 * .collect(Collectors.toList()) : collect is used to save the output in the collections
		 */
		List<String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.println(filtered);

		List<String> moreThanTwoChar = strList.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
		System.out.println(moreThanTwoChar);
		
		//***********************************************************************************
		
		/**
		 * Convert the output into the String using collect()
		 */

		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(G7Countries);
		
		//***********************************************************************************
		
		/**
		 * Finding the distinct element from the list.
		 */
		
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<Integer> distinct = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println(distinct);
		
		//***********************************************************************************
		
		System.out.println("*********************Finding max and min element*********************");

		int[] A = { 6, 8, 3, 5, 1 };

		int max = Arrays.stream(A).max().getAsInt();

		int min = Arrays.stream(A).min().getAsInt();	

		System.out.println("Min element is " + min);
		System.out.println("Max element is " + max);
		
		//***********************************************************************************
		System.out.println("*********************Group By using Stream*********************");
		
		List<String> g = Arrays.asList("geeks", "for", "geeks");

		// Collect the list as map by groupingBy() method. Count the frequency of words
		Map<String, Long> result = g.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Print the result
		System.out.println(result);
		
		//https://www.geeksforgeeks.org/collectors-groupingby-method-in-java-with-examples/
		//https://www.youtube.com/watch?v=2Bfp5giW0iM&ab_channel=TechHives
	}
}

// https://www.java67.com/2014/04/java-8-stream-examples-and-tutorial.html#ixzz6ydi3yhO2

// Max and min element from an array
// https://www.geeksforgeeks.org/stream-max-method-java-examples/
