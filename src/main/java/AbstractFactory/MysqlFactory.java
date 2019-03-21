package AbstractFactory;

public class MysqlFactory implements IFactory {

	@Override
	public UserService createUserService() {
		// TODO Auto-generated method stub
		return new UserServiceMysql();
	}

	@Override
	public DeptService createDeptService() {
		// TODO Auto-generated method stub
		return new DeptServiceMysql();
	}

}
