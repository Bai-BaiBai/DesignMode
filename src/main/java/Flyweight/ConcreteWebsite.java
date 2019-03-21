package Flyweight;

public class ConcreteWebsite extends Website {

	private String webname;
	
	public ConcreteWebsite(String webname) {
		super();
		this.webname = webname;
	}

	@Override
	public void use(User user) {
		// TODO Auto-generated method stub
		System.out.println("网站分类：" + webname + "       用户名称：     " + user.getName());
	}
}
