package AbstractFactory;

public class DeptServiceSqlserver implements DeptService {

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("使用SqlServer插入一条部门信息");
	}

	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
		System.out.println("使用SqlServer查询全部部门信息");
	}

}
