package com.streams.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://howtodoinjava.com/java8/java-streams-by-examples/
public class ForEach {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Murrit");
		list.add("john");
		list.add("piter");
		list.add("marek");
		list.add("mac");

		/*
		 * Printing the list with the help of forEach
		 */
		list.stream().forEach((x) -> System.out.println(x));
		
		//Using MAP and FILTER together
		list.stream().map( x->x.toUpperCase()).filter(t->t.length() >3).forEach(s -> System.out.print(s + " "));

		// **************************************************************
		System.out.println("\n*********************HashMap*********************");

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");

		/**
		 * Printing the HashMap Values
		 */
		map.forEach((key, value) -> System.out.println(key + " : " + value));

		map.entrySet().stream().filter(k -> k.getKey() % 2 == 0).forEach(obj -> System.out.println(obj));

		// **************************************************************
		System.out.println("*********************Filter example*********************");

		for (String s : list) {
			if (s.startsWith("m")) {
				System.out.println(s);
			}
		}

		System.out.println("***********Using stream ...");

		list.stream().filter(t -> t.startsWith("m")).forEach(t -> System.out.println(t));
		
		
		
		System.out.println("*********************Finding max and min element*********************");
		
		

		int[] A = { 6, 8, 3, 5, 1, 9 };

		int max = Arrays.stream(A).max().getAsInt();

		int min = Arrays.stream(A).min().getAsInt();

		System.out.println("Min element is " + min);
		System.out.println("Max element is " + max);
	}
}
