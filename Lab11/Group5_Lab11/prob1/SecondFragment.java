package lesson11.labs.prob1;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prob1b();
	}
	
    // On line 19 it is readable no insert/add functionality can be done.
    private static void prob1b() {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
        nums.add(3.14);
    }

}
