package IteratorTest;

import Iterator.Iterator;

public class ConcreteIterator implements Iterator {
	
	private Class c;
	private int count = -1;
	
	public ConcreteIterator(Class c) {
		super();
		this.c = c;
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return c.getStudent(0);
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		count++;
		if(count < c.count()) {
			return c.getStudent(count);
		}
		return null;
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return count >= c.count()-1 ? true : false;
	}

	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return c.getStudent(count);
	}

}
