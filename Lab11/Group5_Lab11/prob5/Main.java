package lesson11.labs.prob5;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3);
		ints.add(4);
		ints.add(-5);
		ints.add(2);
		ints.add(1);
		System.out.println(secondSmallestElement(ints));
		
		System.out.println(secondSmallestElement(new ArrayList<>()));
		
		List<String> strs = new ArrayList<>();
		strs.add("Potato");
		strs.add("Bob"); 
		strs.add("Bonita"); 
		strs.add("Steve"); 
		strs.add("Tom");
		
		System.out.println(secondSmallestElement(strs));
	}
	
	public static <T extends Comparable<T>> T secondSmallestElement(List<T> list) {
		if(list.size() < 2) return null;
		T min = list.get(0);
		T second = list.get(0);
		
		for(int i = 1; i < list.size(); i++) {
			T nextVal = list.get(i);
			if(min.compareTo(nextVal) > 0) {
				second = min;
				min = nextVal;
			} 
			else if(second.compareTo(nextVal) > 0) {
				second = nextVal;
			}
		}
		return second;
	}
}
