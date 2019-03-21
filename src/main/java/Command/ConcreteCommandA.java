package Command;

public class ConcreteCommandA extends Command {

	public ConcreteCommandA(Receiver receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.runA();
	}
}
