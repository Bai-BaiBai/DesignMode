package State;

public class ConcreteStateA implements State {

	@Override
	public void Handle(Context context) {
		// TODO Auto-generated method stub
		if(context.getHour() < 12) {
			System.out.println("当前时间：" + context.getHour() + "上午工作，精神百倍");
		}else {
			context.setState(new ConcreteStateB());
			context.request();
		}
	}
}
