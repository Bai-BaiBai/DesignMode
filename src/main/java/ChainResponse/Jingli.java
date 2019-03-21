package ChainResponse;

public class Jingli extends Handler {

	public Jingli(Handler handler) {
		super(handler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle(String type, int num) {
		// TODO Auto-generated method stub
		if(type.equals("请假") && num <= 2) {
			System.out.println("经理处理了请求：" + type + num);
		}else {
			nextHandler.handle(type, num);
		}
	}

}
