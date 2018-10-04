package prob4_externalpackage;
import prob4.*;


public class Main {
	public static void main(String[] args) {
		StudentSectionFactory scf = new StudentSectionFactory();
		Section sec1 = scf.createSection(112, "FPP");
		Student stu1 = scf.createStudent("01sF", "Rame_Student 1");
		scf.newTranscriptEntry(stu1, sec1, "B");
		
		Section sec2 = scf.createSection(543, "MPP");
		scf.newTranscriptEntry(stu1, sec2, "A");
		
		Student stu2 = scf.createStudent("02sF", "Shyame_Student2");
		scf.newTranscriptEntry(stu2, sec2, "A+");
		
		Section sec3 = scf.createSection(551, "WAP");
		scf.newTranscriptEntry(stu2, sec3, "A");
		
		//the transcript for any given student
		System.out.println(stu1.getTranscript());
		System.out.println(stu2.getTranscript());
		
		//a list of letter grades for any given section
		System.out.println(sec2);
		
		//a list of courses taken by any given student
		System.out.println(stu1);
		System.out.println(stu2);
		
		//a list of all Students who got a particular grade
		for(Student s : scf.studentList) {
			System.out.println(s.getStudentsForAGrade("A"));
		}
	}
}
