package Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
	
	private List<Object> items = new ArrayList<>();

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}

}
