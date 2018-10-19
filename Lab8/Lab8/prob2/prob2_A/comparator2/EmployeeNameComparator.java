package lesson8.lecture.comparator2;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		/*
		 * 2. 	a) With this, it returns true if e1 and e2 have the same name which is not realistic
		 *		because two different employees can have the same name.
		 *		
		 *		example 1 - two different salaries: 
		 *		Employee joe = new Employee("Joe", 100000);
		 *		Employee joe2 = new Employee("Joe", 200000);
		 *		
		 *		Example 2 - same person but one name all in lower case
		 *		Employee joe = new Employee("joe", 100000);
		 *		Employee joe2 = new Employee("Joe", 100000);
		 *
		 *		To fix this, our compare must be same as our equals for consistency
		 *		
		 */
		int state = e1.name.compareToIgnoreCase(e2.name);
		if(state == 0 && !e1.equals(e2)) {
			state = -1;
		}

		return state;
	}
}
