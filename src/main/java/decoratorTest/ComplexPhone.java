package decoratorTest;

public class ComplexPhone extends PhoneDecorator {

	public ComplexPhone(Phone simplePhone) {
		super(simplePhone);
		// TODO Auto-generated constructor stub
	}

	public void called() {
		super.called();
		System.out.println("灯光闪烁");
	}
}
