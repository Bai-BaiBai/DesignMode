package AbstractFactory;

public class UserServiceMysql implements UserService {

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("使用Mysql插入一条用户信息");
	}

	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
		System.out.println("使用Mysql查询全部用户");
	}

}
