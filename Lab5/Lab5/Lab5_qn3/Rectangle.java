package lesson5.labs.prob3.solution;

public class Rectangle implements IShape {
	private double width;
	private double height;
	private double area;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		this.area = computeArea();
	}
	
	public double computeArea() {
		return width * height;
	}
	
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public double getArea() {
		return area;
	}
}
