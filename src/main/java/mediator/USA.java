package mediator;

public class USA extends Country {

	public USA(UnitedNations mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	public void declare(String message) {//使用中介者发出消息
		mediator.declare(message, this);
	}
	
	public void getMessage(String message) {
		System.out.println("USA getMessage :" + message);
	}
}
