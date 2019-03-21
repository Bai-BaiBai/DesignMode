package Builder;

public class ConcreteBuilder1 implements Builder {
	
	private Poduct poduct = new Poduct();

	@Override
	public void builderPartA() {
		// TODO Auto-generated method stub
		poduct.add("PartA");
	}

	@Override
	public void builderPartB() {
		// TODO Auto-generated method stub
		poduct.add("PartB");
	}

	@Override
	public Poduct getResult() {
		// TODO Auto-generated method stub
		return poduct;
	}
}
