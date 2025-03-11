package kosa.relation;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseName;
	private List<Student> students; //수강한 학생들
	
	public Course() {}

	public Course(String courseName) {
		super();
		this.courseName = courseName;
		students = new ArrayList<Student>();
	}

	public void addStudent(Student student) {
		students.add(student);		
	}
	
	public void printCourse() {
		System.out.println("과목명: "+courseName);
		for (Student student: students) {
			System.out.println("수강신청 학생명: "+student.getName());
		}
	}
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
