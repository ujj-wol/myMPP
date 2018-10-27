package lesson11.labs.prob1;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prob1a();
	}
	
	// On line number 18 List<Number> nums = ints; can not assign the values of subclass arraylist to any other/ superclass list.
    private static void prob1a() {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        List<Number> nums = ints;
        nums.add(3.14);
    }

}
