package lesson3.labs.prob3b;

public class Main {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		Cylinder cyl = new Cylinder(5, 10);
		
		System.out.printf("\nThe area of circle is : %.2f sq.units.", c.computeArea());
		System.out.printf("\nThe volume of cylinder is : %.2f sq.units.", cyl.computeVolume());
	}
}
