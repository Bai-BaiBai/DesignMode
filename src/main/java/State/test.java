package State;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context(new ConcreteStateA());//设置初始状态
		context.setHour(12);
		
		context.request();
		context.setHour(13);
		context.request();
		context.setHour(15);
		context.request();
		context.setHour(18);
		context.setFinish(true);
		context.request();
		context.setHour(19);
		context.request();
		context.setHour(22);
		context.request();
		//context.setFinish(true);
		context.request();
		context.request();
		
	}

}
