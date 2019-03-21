package strategy;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String type = "满300减100";
		double money = 900d;
		CashContext context = null;
		switch (type) {
			case "正常收费":
				 context = new CashContext(new CashNormal());
				break;
			case "打八折":
				context = new CashContext(new CashRebate("0.8"));
				break;
			case "满300减100":
				context = new CashContext(new CashReturn("300", "100"));
			default:
				break;
		}
		System.out.println(context.getResult(money));
	}

}
