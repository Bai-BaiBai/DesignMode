package decoratorTest;

public class PhoneDecorator extends Phone{

	private Phone phone;
	
	public PhoneDecorator(Phone phone) {
		this.phone = phone;
	}
	
	public void called() {
		if(phone != null) {
			phone.called();
		}
	}
}
