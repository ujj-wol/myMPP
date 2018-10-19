package lesson5.labs.prob3.solution;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(20);
		Rectangle r1 = new Rectangle(4.0, 5.0);
		Rectangle r2 = new Rectangle(10.0, 15.0);
		Triangle tr1 = new Triangle(8.0, 5.0);
		Triangle tr2 = new Triangle(8.0, 5.0);
		List<IShape> lists = new ArrayList<IShape>();
		lists.add(c1);
		lists.add(c2);
		lists.add(r1);
		lists.add(r2);
		lists.add(tr1);
		lists.add(tr2);
		double sum = 0.0;
		for (IShape sh: lists) {
			sum += sh.computeArea();
		}
		System.out.format("Sum of Areas: %.2f", sum);
	}

}
