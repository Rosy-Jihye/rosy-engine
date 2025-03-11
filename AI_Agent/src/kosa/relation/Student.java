package kosa.relation;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Course> courses; //학생이 수강신청한 과목들 //이거는 처음부터 알 수 없어서 지금 초기화를 할 수 없음.
	
	public Student() {}

	public Student(String name) {
		super();
		this.name = name;
		courses = new ArrayList<Course>();
			
	}
	
	public void register(Course course) {
		courses.add(course);
		course.addStudent(this);
		//this는 register method를 호출하는 그 student다
		
	}

	public void printMember() {
		System.out.println("학생이름: "+name);
		for(Course course : courses) {
			System.out.println("수강과목"+course.getCourseName());
			
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
