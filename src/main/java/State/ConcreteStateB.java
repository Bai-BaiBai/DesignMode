package State;

public class ConcreteStateB implements State {

	@Override
	public void Handle(Context context) {
		// TODO Auto-generated method stub
		if (context.getHour() < 13) {
			System.out.println("当前时间：" + context.getHour() + "饿了，午饭，犯困，午休");
		}else {
			context.setState(new ConcreteStateC());
			context.request();
		}
	}

}
