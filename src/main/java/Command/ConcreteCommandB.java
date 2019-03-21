package Command;

public class ConcreteCommandB extends Command {

	public ConcreteCommandB(Receiver receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.runB();
	}
}
