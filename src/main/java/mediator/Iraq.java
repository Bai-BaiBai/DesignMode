package mediator;

public class Iraq extends Country {

	public Iraq(UnitedNations mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	public void declare(String message) {//使用中介者发出消息
		mediator.declare(message, this);
	}
	
	public void getMessage(String message) {
		System.out.println("Iraq get message :" + message);
	}
}
