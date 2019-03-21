package decorator;

public class Tshirt extends Finarty {

	public Tshirt(Person component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	public void show() {
		super.show();
		System.out.println("穿T恤");
	}
}