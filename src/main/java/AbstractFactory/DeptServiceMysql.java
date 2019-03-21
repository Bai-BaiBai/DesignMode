package AbstractFactory;

public class DeptServiceMysql implements DeptService {

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("使用Mysql插入一条部门信息");
	}

	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
		System.out.println("使用Mysql查询全部部门信息");
	}

}
