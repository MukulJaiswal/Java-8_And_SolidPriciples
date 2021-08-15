import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative {
	public static void main(String[] args) {

		/**
		 * Imperative approach --Uses default approach
		 * This makes sum mutable which can creates problem in multithreading
		 */

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("Imperative : " + sum);
		
		/**
		 * Declarative Approach - Uses inbuild function and focuses only on how to achieve result.
		 * This interally is threaded handled as using Declarative approach is based on Immutability concept of class.
		 * Java 8 uses functional programming which is a declarative approach .
		 */
		
		int sum1  = IntStream.rangeClosed(1, 100).parallel().sum();
		System.out.println("Declarative : " + sum);
		
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk"); 
		
		long count = strList.stream().filter(x -> x.isEmpty()) .count();
		System.out.println(count);
		
		long num = strList.stream() .filter(x -> x.length()> 2) .count();
		System.out.println(num);
		
		List<String> filtered = strList.stream() .filter(x -> !x.isEmpty()) .collect(Collectors.toList());
		System.out.println(filtered);
		
		List<String> moreThanTwoChar = strList.stream().filter( x -> x.length() > 2).collect(Collectors.toList());
		System.out.println(moreThanTwoChar);
		
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"); 
		String G7Countries = G7.stream() .map(x -> x.toUpperCase()) .collect(Collectors.joining(", "));
		System.out.println(G7Countries);
		
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4); 
		List<Integer> distinct = numbers.stream() .map( i -> i*i) .distinct() .collect(Collectors.toList());
		System.out.println(distinct);
		
		//https://www.java67.com/2014/04/java-8-stream-examples-and-tutorial.html#ixzz6ydi3yhO2
		
		
		//Max and min element from an array
		//https://www.geeksforgeeks.org/stream-max-method-java-examples/
		
	}
}









