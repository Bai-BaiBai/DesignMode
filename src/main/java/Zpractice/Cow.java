package Zpractice;

public class Cow {

	private int age;

	public Cow(int age) {
		this.age = age;
	}
	
	public void grow() {
		age++;
		if(age >= 4) {
			breed();
		}
	}
	
	public Cow breed() {
		return new Cow(1);
	}
}
