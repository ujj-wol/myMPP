package lesson5.labs.prob3.solution;

public class Triangle implements IShape {
	private double base;
	private double height;
	private double area;
	public Triangle (double base, double height) {
		this.base = base;
		this.height = height;
		this.area = computeArea();
	}
	
	public double getArea() {
		return area;
	}

	public double computeArea() {
		return 0.5 * base * height;
	}
	
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
}
