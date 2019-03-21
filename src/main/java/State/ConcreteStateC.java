package State;

public class ConcreteStateC implements State {

	@Override
	public void Handle(Context context) {
		// TODO Auto-generated method stub
		if(context.getHour() < 18) {
			System.out.println("当前时间：" + context.getHour() + "下午状态还不错，继续努力");
		}else {
			context.setState(new ConcreteStateD());
			context.request();
		}
	}

}
