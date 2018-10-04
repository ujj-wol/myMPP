package prob2A;

public class GradeReport {
	private Student student;
	
	GradeReport(Student student) {
		this.student = student;
	}
	
	//This can be taken out if we assume that 
	public GradeReport(String studentName) {
		this.student = new Student(studentName);
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
}
