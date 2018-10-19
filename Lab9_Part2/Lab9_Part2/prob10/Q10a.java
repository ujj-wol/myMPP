package lesson9.labs.prob10;

import java.util.stream.IntStream;

public class Q10a {
	public static void main(String[] args) {
		// Returns an infinite stream.
		//IntStream ones = IntStream.generate(() -> 1).distinct();
		// Solution: Add limit for this stream.
		IntStream ones = IntStream.generate(() -> 1).limit(1);
		ones.forEach(System.out::println);
	}

}
