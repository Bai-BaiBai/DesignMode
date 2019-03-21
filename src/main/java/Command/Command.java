package Command;

public abstract class Command {

	protected Receiver receiver;

	public Command(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	
	public abstract void execute();
}
