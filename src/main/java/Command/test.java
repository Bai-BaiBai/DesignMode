package Command;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver receiver = new Receiver();
		Invoker invoker = new Invoker();
		
		invoker.setCommand(new ConcreteCommandA(receiver));
		invoker.setCommand(new ConcreteCommandB(receiver));
		invoker.ExecuteCommand();
	}
}
