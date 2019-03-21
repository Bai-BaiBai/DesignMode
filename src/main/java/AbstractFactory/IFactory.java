package AbstractFactory;

public interface IFactory {

	public UserService createUserService();
	public DeptService createDeptService();
}
