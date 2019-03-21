package AbstractFactory;

/**
 * @author BaiZehong
 *
 */
public class test {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UserService userService = Factory.createUserService();
		userService.selectAll();
	}

}
