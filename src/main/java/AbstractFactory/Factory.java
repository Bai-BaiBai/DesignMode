package AbstractFactory;

public class Factory {

	private static final String DB_STRING = LoadProperties.getProperties("DB");
	private static final String PACKAGE_NAME = LoadProperties.getProperties("PACKAGE_NAME");
	
	public static UserService createUserService() throws Exception {
		
		String className = PACKAGE_NAME + "." +"UserService" + DB_STRING;
		System.out.println(className);
		Class<?> class1 = Class.forName(className);
		
		return (UserService) class1.newInstance();
	}
	
	public static DeptService createDeptService() {
		DeptService deptService = null;
		switch (DB_STRING) {
		case "SqlServer":
			deptService = new DeptServiceSqlserver();
			break;
		case "Mysql":
			deptService = new DeptServiceMysql();
			break;
		default:
			break;
		}
		return deptService;
	}
}
