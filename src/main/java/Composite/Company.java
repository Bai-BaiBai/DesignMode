package Composite;

public abstract class Company {

	private String name;

	public String getName() {
		return name;
	}

	public Company(String name) {
		super();
		this.name = name;
	}
	
	public abstract void add(Company company);
	public abstract void remove(Company company);
	public abstract void display(int depth);
	public abstract void duty();//履行职责
}
