package lesson3.labs.prob3a;

public class Cylinder {
	protected double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	public double computeVolume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}
}
