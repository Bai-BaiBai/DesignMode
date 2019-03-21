package ChainResponse;

public class Zongjingli extends Handler {

	public Zongjingli(Handler handler) {
		super(handler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle(String type, int num) {
		// TODO Auto-generated method stub
		if(type.equals("请假")) {
			System.out.println("总经理处理了请求：" + type + num);
		}else if(type.equals("加薪") && num <= 500) {
			System.out.println("总经理处理了请求：" + type + num);
		}else {
			System.out.println("总经理拒绝了请求：" + type + num);
		}
	}

}
