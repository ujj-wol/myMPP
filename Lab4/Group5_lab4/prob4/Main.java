package prob4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		
		//create 4 Employees, one hourly, one salaried, and two commissioned and add them to the list
		Hourly hourlyEmp = new Hourly(1, 12, 40); //1920
		Salaried salariedEmp = new Salaried(2, 10000);
		Commissioned commissionedEmp = new Commissioned(3, 5000, 1);
		Order ord1 = new Order("505", 1300);
		//third employee has 1 order
		commissionedEmp.addOrder(ord1);
		employees.add(hourlyEmp);
		employees.add(salariedEmp);
		employees.add(commissionedEmp);
		
		//fourth employee has two orders
		Order ord2 = new Order("506", 1500);
		Order ord3 = new Order("507", 2500);
		List<Order> orders23 = new ArrayList<>(Arrays.asList(ord2, ord3));
		Commissioned commissionedEmp2 = new Commissioned(4, 6000, 1, orders23);
		employees.add(commissionedEmp2);
		
		for(Employee e : employees) {
			e.calcCompensation(1, 1992).print(); //put any random date here, anything works for this implementation
		}
	}
}
