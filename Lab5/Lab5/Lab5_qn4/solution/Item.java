package lesson5.labs.prob4.solution;

public class Item {
	String name;
	private Item(String name) {
		this.name = name;
	}
	public static Item newItem(String name) {
		return new Item(name);
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name;
	}
}
