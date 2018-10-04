package lesson3.labs.prob3a;

public class Circle extends Cylinder {

	public Circle(double radius) {
		super(radius, 0);
	}
	
	public double computeArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
