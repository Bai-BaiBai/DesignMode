package IteratorTest;

import java.util.ArrayList;
import java.util.List;

public class Class{

	private List<Student> students = new ArrayList<>();
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	

	public List<Student> getStudents() {
		return students;
	}



	public int count() {
		return students.size();
	}
	
	public Student getStudent(int index) {
		return students.get(index);
	}
}
