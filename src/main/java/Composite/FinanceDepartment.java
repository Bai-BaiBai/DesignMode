package Composite;

public class FinanceDepartment extends Company {

	public FinanceDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Company company) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Company company) {
		// TODO Auto-generated method stub

	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= depth; i++) {
			System.out.print('-');
		}
		System.out.println(getName());
	}

	@Override
	public void duty() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "公司财务收支管理");
	}

}
