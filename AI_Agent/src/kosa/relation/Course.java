package kosa.relation;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseName;
	private List<Student> students; //������ �л���
	
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
		System.out.println("�����: "+courseName);
		for (Student student: students) {
			System.out.println("������û �л���: "+student.getName());
		}
	}
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
