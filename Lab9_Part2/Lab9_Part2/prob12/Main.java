package lesson9.labs.prob12;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		//print the number of Employees in list whose salary > 100000 and whose last name begins
		//with a letter that comes after the letter 'E'
		System.out.println(LambdaLibrary.SALARY_LIMIT_AND_LAST_NAME_BEGINING_WITH_CHECK.apply(list, 100000, "[F-Z][a-z]*"));
		
		//print a list of sorted full names - all upper case -- of Employees with
		//salary > 85000 and whose first name begins with a letter that comes before  the letter 'R'
//		List<String> s = list.stream()
//						.filter(e -> e.getSalary() > 85000)
//						.filter(e -> e.getFirstName().matches("[A-Q][a-z]*"))
//						.map(e -> e.getFirstName() + " " + e.getLastName())
//						.map(str -> str.toUpperCase())
//						.sorted()
//						.collect(Collectors.toList());
//
//		s.forEach(System.out::println);
		
		List<String> fullNameList = LambdaLibrary.SALARY_LIMIT_AND_FIRST_NAME_BEGINING_WITH_CHECK.apply(list, 85000, "[A-Q][a-z]*");
		fullNameList.forEach(System.out::println);
	}

}
