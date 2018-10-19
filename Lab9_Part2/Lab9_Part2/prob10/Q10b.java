package lesson9.labs.prob10;

import java.util.stream.Stream;

public class Q10b {
	public static void main(String[] args) {
		System.out.println(Stream.of("Bill", "Thomas", "Mary").reduce((s1, s2) -> s1 + ", " + s2).get());
	}
}
