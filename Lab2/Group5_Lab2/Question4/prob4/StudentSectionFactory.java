package prob4;

import java.util.ArrayList;
import java.util.List;

//new class
public class StudentSectionFactory {
	public List<Student> studentList = new ArrayList<>();
	
	public Student createStudent(String id, String name) {
		if(id == null || name == null)
			throw new IllegalArgumentException("Student name and id cannot be null");
		Student st = new Student(id, name);
		
		studentList.add(st);
		return st;
	}
	
	public Section createSection(int secNum, String courseName) {
		if(secNum == 0 || courseName == null)
			throw new IllegalArgumentException("Section number and course name cannot be null");
		Section sec = new Section(secNum, courseName);

		return sec;
		
	}
	
	public void newTranscriptEntry(Student s, Section sect, String grade) {
		TranscriptEntry e = new TranscriptEntry(s, sect, grade);
		s.addTranscriptEntry(e);
		sect.addTranscriptEntry(e);
	}
	
}
