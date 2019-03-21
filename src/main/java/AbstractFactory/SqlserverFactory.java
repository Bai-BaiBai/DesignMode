package AbstractFactory;

public class SqlserverFactory implements IFactory {

	@Override
	public UserService createUserService() {
		// TODO Auto-generated method stub
		return new UserServiceSqlserver();
	}

	@Override
	public DeptService createDeptService() {
		// TODO Auto-generated method stub
		return new DeptServiceSqlserver();
	}

}
