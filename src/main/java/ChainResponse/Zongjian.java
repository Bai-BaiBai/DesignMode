package ChainResponse;

public class Zongjian extends Handler {

	public Zongjian(Handler handler) {
		super(handler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle(String type, int num) {
		// TODO Auto-generated method stub
		if(type.equals("请假") && num <= 5) {
			System.out.println("总监处理了请求：" + type + num);
		}else {
			nextHandler.handle(type, num);
		}
	}

}
