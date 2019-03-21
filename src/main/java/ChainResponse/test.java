package ChainResponse;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Handler zongjingli = new Zongjingli(null);
		Handler zongjian = new Zongjian(zongjingli);
		Handler jingli = new Jingli(zongjian);
		
		String type = "请假";
		int num = 1;
		
		jingli.handle(type, num);
		num = 3;
		jingli.handle(type, num);
		num = 7;
		jingli.handle(type, num);
		
		type = "加薪";
		num = 300;
		jingli.handle(type, num);
		num = 1000;
		jingli.handle(type, num);
		
		type = "辞职";
		jingli.handle(type, num);
	}

}
