package lesson3.lecture.inheritance2;

public class Main {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2,3);
		System.out.println("Area = " + r1.computeArea());
		System.out.println(r1);
		System.out.println("--------");
		Rectangle r2 = new Square(5);
		System.out.println("Area = " + r2.computeArea());
		r2.setSide2(6); //this access to square is undesirable
		System.out.println(r2);
		
		System.out.println("Area = " + r2.computeArea());
	}

}
