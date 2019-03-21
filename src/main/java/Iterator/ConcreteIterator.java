package Iterator;

public class ConcreteIterator implements Iterator {
	
	private ConcreteAggregate aggregate;
	private int count = 0;
	
	public ConcreteIterator(ConcreteAggregate aggregate) {
		super();
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return null;
	}

}
