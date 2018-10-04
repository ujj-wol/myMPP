package lesson3.labs.prob1_usingComposition;

public class PersonWithJob {
	private double salary;
	private Person person;
	
	public double getSalary() {
		return salary;
	}
	
	PersonWithJob(String n, double s) {
		person = new Person(n);
		salary = s;
	}
	
	public Person getPerson() {
		return person;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		else if(aPerson instanceof PersonWithJob) {
			PersonWithJob p = (PersonWithJob)aPerson;
			if(this.person.equals(p.person) && this.salary == p.salary)
				return true;
			return false;
		}
		else if (aPerson instanceof Person) {
			Person p = (Person)aPerson;
			if(this.person.getName().equals(p.getName()))
				return true;
			return false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		
		PersonWithJob p3 = new PersonWithJob("Joe", 30000);
		Person p4 = new Person("Joe");
		
		PersonWithJob p5 = new PersonWithJob("Jonny", 30000);
		Person p6 = new Person("Jonny");
		
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2)); //withjob vs person
		System.out.println("p2.equals(p1)? " + p2.equals(p1)); //person vs withjob
		
		System.out.println("p1.equals(p3)? " + p1.equals(p3)); //withjob vs withjob
		System.out.println("p2.equals(p4)? " + p2.equals(p4)); //person vs person
		
		System.out.println("p1.equals(p5)? " + p1.equals(p5)); //withjob vs withjob
		System.out.println("p2.equals(p6)? " + p2.equals(p6)); //person vs person
		
		System.out.println("p5.equals(p6)? " + p5.equals(p6)); //withjob vs person
	}
}
