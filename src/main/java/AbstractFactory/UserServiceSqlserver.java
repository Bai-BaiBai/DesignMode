package AbstractFactory;

public class UserServiceSqlserver implements UserService {

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("使用SqlServer插入一条用户信息");
	}

	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
		System.out.println("使用SqlServer查询全部用户信息");
	}

}
