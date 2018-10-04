package prob2A;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Group 5");
		System.out.println(s1.getName());
		
		GradeReport gr = new GradeReport("Student name");
		System.out.println(gr.getStudent().getName());

	}

}
