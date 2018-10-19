package lesson5.labs.prob2;

public class RubberDuck extends Duck{

	public void display() {
		System.out.println(" Displaying");
		
	}
	
	public RubberDuck() {
		FlyBehavior fb = new CannotFly();
		setFlyBehavior(fb);
		
		QuackBehavior qb = new Squeak();
		setQuackBehavior(qb);
	}
}
