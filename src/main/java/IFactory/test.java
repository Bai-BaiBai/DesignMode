package IFactory;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IFactory factory = new SubFactory();
		Operator operator = factory.createOperator();
		operator.setNumberA(1);
		operator.setNumberB(3);
		System.out.println(operator.getResult());
	}

}
