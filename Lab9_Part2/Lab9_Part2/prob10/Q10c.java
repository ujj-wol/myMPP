package lesson9.labs.prob10;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Q10c {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream myIntStream = IntStream.of(10, -20, 30, 60, 50, -10);
		IntSummaryStatistics iss = myIntStream.summaryStatistics();
		System.out.println("Maximum is: " + iss.getMax());
		System.out.println("Minimum is: " + iss.getMin());
	}
}
