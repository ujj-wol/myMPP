package prob4;

import java.util.*;

public class Section {
	String courseName;
	int sectionNumber;
	List<TranscriptEntry> gradeSheet = new ArrayList<>();
	
	//package level
	Section(int sectionNumber, String courseName) {
		this.courseName = courseName;
		this.sectionNumber = sectionNumber;
	}
	
	public void addTranscriptEntry(TranscriptEntry e) {
		gradeSheet.add(e);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(TranscriptEntry e : gradeSheet) {
			sb.append(e + "\n");
		}
		return sb.toString();
	}
}
