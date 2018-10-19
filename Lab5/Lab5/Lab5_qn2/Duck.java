package lesson5.labs.prob2;

public abstract class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public void swim() {
		System.out.println(" Swimming");
	}
	
	public void fly() {
		flyBehavior.fly();
	}
	
	public void quack() {
		quackBehavior.quack();
	}
	abstract public void display();

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
		
}
