package lesson9.labs.prob4;

import java.math.BigInteger;
import java.util.stream.Stream;

public class PrimeStream {
	
	private void printFirstNPrimes(int i) {
		BigInteger big = new BigInteger("2");

		final Stream<BigInteger> primes = Stream.iterate(big, BigInteger::nextProbablePrime);// x -> x.nextProbablePrime());
																							
		primes
		.limit(i).forEach(System.out::println);

	}

	public static void main(String[] args) {

		PrimeStream ps = new PrimeStream(); // PrimeStream is enclosing class
		ps.printFirstNPrimes(10);
		System.out.println("====");
		ps.printFirstNPrimes(5);
	}
}
