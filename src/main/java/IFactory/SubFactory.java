package IFactory;

public class SubFactory implements IFactory {

	@Override
	public Operator createOperator() {
		// TODO Auto-generated method stub
		return new OperatorSub();
	}

}
