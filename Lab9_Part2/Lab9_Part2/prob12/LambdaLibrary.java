package lesson9.labs.prob12;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	public static final
		TriFunction<List<Employee>, Integer, String, Long> SALARY_LIMIT_AND_LAST_NAME_BEGINING_WITH_CHECK
			= (list, salary, regex) -> list.stream()
										   .filter(e -> e.getSalary() > salary)
										   .filter(e -> e.getLastName().matches(regex))
										   .count();
			
	
	public static final	
		TriFunction<List<Employee>, Integer, String, List<String>> SALARY_LIMIT_AND_FIRST_NAME_BEGINING_WITH_CHECK
			= (list, salary, regex) ->  list.stream()
											.filter(e -> e.getSalary() > salary)
											.filter(e -> e.getFirstName().matches(regex))
											.map(e -> e.getFirstName() + " " + e.getLastName())
											.map(str -> str.toUpperCase())
											.sorted()
											.collect(Collectors.toList());
}
