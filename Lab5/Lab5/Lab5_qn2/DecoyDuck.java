package lesson5.labs.prob2;

public class DecoyDuck extends Duck {

	public void display() {
		System.out.println(" Displaying");		
	}
	
	public DecoyDuck() {
		FlyBehavior fb = new CannotFly();
		setFlyBehavior(fb);
		
		QuackBehavior qb = new MuteQuack();
		setQuackBehavior(qb);
	}
}
