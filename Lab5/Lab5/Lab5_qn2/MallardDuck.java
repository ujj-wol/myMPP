package lesson5.labs.prob2;

public class MallardDuck extends Duck {

	public void display() {
		System.out.println(" Display");
	}

	public MallardDuck() {
		FlyBehavior fb = new FlyWithWings();
		setFlyBehavior(fb);
		
		QuackBehavior qb = new Quack();
		setQuackBehavior(qb);
	}
}
