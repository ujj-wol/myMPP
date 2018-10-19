package lession8.labs.prob4;

import java.util.Arrays;
import java.util.List;

public class Example {
	public static void main(final String[] args) {
		final List<String> words = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		char c = 'N'; 
		char d = 'd';
		int len = 4;
		Example exa = new Example();
		int count = exa.countWords(words, c, d, len);
		System.out.println(count);
	}

	public int countWords(List<String> words, char c, char d, int len) {
		long count = words.stream()					
						  .filter(x -> x.contains(c + ""))
						  .filter(x -> !x.contains(d + ""))
						  .filter(x -> x.length() == len)
						  .count();
		return (int) count;
	}
}
