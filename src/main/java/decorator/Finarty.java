package decorator;

public class Finarty extends Person {
	
	private Person person;

	public Finarty(Person person) {
		this.person = person;
	}
	
	public void show() {
		if(person != null) {
			person.show();
		}
	}
}
