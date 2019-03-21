package Builder;

public class ConcreteBuilder2 implements Builder {

	private Poduct poduct = new Poduct();
	
	@Override
	public void builderPartA() {
		// TODO Auto-generated method stub
		poduct.add("PartX");
	}

	@Override
	public void builderPartB() {
		// TODO Auto-generated method stub
		poduct.add("PartY");
	}

	@Override
	public Poduct getResult() {
		// TODO Auto-generated method stub
		return poduct;
	}
}
