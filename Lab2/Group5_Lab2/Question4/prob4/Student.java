package prob4;

import java.util.*;

public class Student {
	String studentId;
	String name;
	List<TranscriptEntry> grades = new ArrayList<>();
	
	public Transcript getTranscript() {
		return new Transcript(grades, this);
		
	}

	//package level
	Student(String id, String name) {
		this.name = name;
		studentId = id;
	}
	
	public void addTranscriptEntry(TranscriptEntry e) {
		grades.add(e);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(TranscriptEntry e : grades) {
			sb.append(e.section.courseName + "\n");
		}
		return sb.toString();
	}
	
	public String getStudentsForAGrade(String g) {
		StringBuilder sb = new StringBuilder("[");
		for(TranscriptEntry e : grades) {
			if(e.grade.equals(g))
				sb.append(e.student.name);
		}
		return sb.toString() + "]";
	}
}
