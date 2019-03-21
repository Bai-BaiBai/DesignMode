package simplefactoryTest;

public class Person {

	private String sex;

	public Person(String sex) {
		this.sex = sex;
	}
	
	public void say() {
		System.out.println("我是" + sex);
	}
}
