package lesson3.labs.prob1_usingComposition;


public class Person {
	private String name;
	
	Person(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		else if(aPerson instanceof Person) {
			Person p = (Person)aPerson;
			if(this.name.equals(p.name))
				return true;
			return false;
		}
		else if(aPerson instanceof PersonWithJob) {
			PersonWithJob p = (PersonWithJob) aPerson;
			if(this.name.equals(p.getPerson().getName()))
				return true;
			return false;
		}
		return false;
	}
	public static void main(String[] args) {
		
	}

}
