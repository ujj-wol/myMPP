package lesson5.labs.prob2;

public class RedHeadDuck extends Duck{

	public void display() {
		System.out.println(" Displaying");		
	}
	
	public RedHeadDuck(){
		
		FlyBehavior fb = new FlyWithWings();
		setFlyBehavior(fb);
		
		QuackBehavior qb = new Quack();
		setQuackBehavior(qb);
	}
}
