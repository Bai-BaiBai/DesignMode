package ProxyTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class UserServiceProxy implements UserService {
	
	private UserService userService;
	
	public UserServiceProxy() {
		// TODO Auto-generated constructor stub
		this.userService = new UserServiceImpl();
	}

	@Override
	public void selectById() {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		try {
			System.out.println("调用了Method，时间：" + format.format(new Date()));
			userService.selectById();
			Random random = new Random();
			int a = random.nextInt(100);
			int b = random.nextInt(10);
			int c = a/0;
			System.out.println("调用成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("调用失败！");
		}
	}

}
