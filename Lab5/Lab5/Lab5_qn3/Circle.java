package lesson5.labs.prob3.solution;

public class Circle implements IShape {
	private double radius;
	private double area;
	public Circle(double radius) {
		this.radius = radius;
		this.area = computeArea();
	}
	public double computeArea() {
		return Math.PI * radius * radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return area;
	}
}
