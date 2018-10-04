package lesson3.labs.prob3b;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double computeArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
