package IFactory;

public class AddFactory implements IFactory {

	@Override
	public Operator createOperator() {
		// TODO Auto-generated method stub
		return new OperatorAdd();
	}

}
