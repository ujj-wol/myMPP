package lesson9.labs.prob11b;

import java.util.List;

public class LambdaLibrary {
	public static final 
	TriFunction<List<Employee>, Integer, String, String> SALARY_LIMIT_AND_LAST_NAME_BEGINS_CONDITION 
		  = (list, salary, regex) -> list.stream()
										 .filter(emp -> emp.getSalary() > salary)
										 .filter(emp -> emp.getLastName().matches(regex))
										 //.filter(e -> e.getLastName().startsWith(regex))
										 .map(emp -> emp.getFirstName() + " " + emp.getLastName())
										 .sorted()
										 .reduce((x, y) -> x + ", " + y).get();
}
