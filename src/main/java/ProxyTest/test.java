package ProxyTest;

public class test {

	/**
	 * 在某应用软件中，需要记录业务方法的调用日期，在不修改现有业务类的基础上，为每一个类提供一个日记记录代理类，
	 * 在代理类中输出日志，如在业务方法Mehtod()的调用之前，输出“Method方法被调用，调用时间2016.11.18 11:11：11”，
	 * 调用之后没有抛出异常则输出“Mehtod方法调用成功”，否则输出“Mehtod方法调用失败”，
	 * 在代理类中调用真实业务类的业务方法，使用代理模式模拟实现。 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserService service = new UserServiceProxy();
		service.selectById();
	}

}
