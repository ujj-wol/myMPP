package lesson3.labs.prob3b;

public class Cylinder {
	private Circle base; //this is because a cylinder has a circular base
	private double height;
	
	public Cylinder(double radius, double height) {
		this.base = new Circle(radius);
		this.height = height;
	}
	
	public double computeVolume() {
		return base.computeArea() * height;
	}
}
