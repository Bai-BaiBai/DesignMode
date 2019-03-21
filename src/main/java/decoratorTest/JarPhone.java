package decoratorTest;

public class JarPhone extends PhoneDecorator {

	public JarPhone(Phone simplePhone) {
		super(simplePhone);
		// TODO Auto-generated constructor stub
	}

	public void called() {
		super.called();
		System.out.println("震动");
	}
}
