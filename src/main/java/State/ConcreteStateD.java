package State;

public class ConcreteStateD implements State {

	@Override
	public void Handle(Context context) {
		// TODO Auto-generated method stub
		if(context.isFinish()) {
			System.out.println("当前时间：" + context.getHour() + "下班回家");
		}else if (context.getHour() < 21) {
			System.out.println("当前时间：" + context.getHour() + "加班，累");
		}else{
			context.setState(new ConcreteStateE());
			context.request();
		}
		
	}

}
