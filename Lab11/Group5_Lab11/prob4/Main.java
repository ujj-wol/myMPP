package lesson11.labs.prob4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		//prob4a
		List<Integer> ints = new ArrayList<>(); 
		ints.add(1);
		ints.add(2);
		List<? extends Number> nums = ints; 
		double dbl = sum(nums); 
		System.out.println(ints);
		System.out.println(dbl);
		nums.add(3.14); 					//compiler error because the extends wildcard only allows get operation but not add operation.
		
		//prob4b
		List<Object> objs = new ArrayList<>(); 
		objs.add(1);
		objs.add("two");
		List<? super Integer> intz = objs; 
		intz.add(3);
		System.out.println(intz);
		double dble = sum(intz);			//compiler error because List 'intz' can have Integer or any Supertype of it, but the method sum
											//only expects Collection of type Number or subtype of Number.
		System.out.println(dble);
	}
	
	public static double sum(Collection<? extends Number> nums) {
		double s = 0.0;
		for(Number num : nums) 
			s += num.doubleValue(); 
		return s;
	};
}
