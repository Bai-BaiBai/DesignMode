package State;

public class ConcreteStateE implements State {

	@Override
	public void Handle(Context context) {
		// TODO Auto-generated method stub
		if(context.isFinish()) {
			System.out.println("当前时间：" + context.getHour() + "下班回家");
		}else {
			System.out.println("当前时间：" + context.getHour() + "不行了，睡着了");
		}
		
	}

}
