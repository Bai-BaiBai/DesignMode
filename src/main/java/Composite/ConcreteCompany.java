package Composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {
	
	private List<Company> children = new ArrayList<>();

	public ConcreteCompany(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Company company) {
		// TODO Auto-generated method stub
		children.add(company);
	}

	@Override
	public void remove(Company company) {
		// TODO Auto-generated method stub
		children.remove(company);
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= depth; i++) {
			System.out.print('-');
		}
		System.out.println(getName());
		for (Company company : children) {
			company.display(depth + 2); 
		}
	}

	@Override
	public void duty() {
		// TODO Auto-generated method stub
		for (Company company : children) {
			company.duty();
		}
	}

}
