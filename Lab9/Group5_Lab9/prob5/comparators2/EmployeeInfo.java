package lesson9.lecture.comparators2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY};
	Function<Employee, String> byName = e -> e.getName();
	Function<Employee, Integer> bySalary = e -> -e.getSalary();
	
	HashMap<SortMethod, Comparator<Employee>> rule = new HashMap<>();
	
	public EmployeeInfo(){
		rule.put(SortMethod.BYNAME, Comparator.comparing(byName).thenComparing(bySalary));
		rule.put(SortMethod.BYSALARY, Comparator.comparing(bySalary).thenComparing(byName));
	}
	
	public void sort(List<Employee> emps, final SortMethod method) {
		Collections.sort(emps,  rule.get(method));
	}
	
	
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Rick", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Tim", 10000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
