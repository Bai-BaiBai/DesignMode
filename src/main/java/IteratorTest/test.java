package IteratorTest;

import java.util.Collections;

import Iterator.Iterator;

public class test {

	/**
	 * 某教务管理信息系统中，一个班级（class）包含多个学生(Stedent)，
	 * 使用java内置迭代器实现对学生数据的双向遍历，要求按学生年龄由大到小的次序输出学生信息，
	 * 现使用迭代器模式设计系统。
	 * 
	 * ps:这个实现有BUG
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class class1 = new Class();
		class1.addStudent(new Student("yi", 1));
		class1.addStudent(new Student("er", 2));
		class1.addStudent(new Student("s", 3));
		
		
		Collections.sort(class1.getStudents());
		Iterator iterator = new ConcreteIterator(class1);
		while(!iterator.isDone()) {
			Student student = (Student)iterator.next();
			System.out.println(student.getName());
		}
	}

}
