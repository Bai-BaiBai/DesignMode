package strategy;

public class CashContext {

	private CashSupper cashSupper;

	public CashContext(CashSupper cashSupper) {
		// TODO Auto-generated constructor stub
		this.cashSupper = cashSupper;
	}
	
/*	与简单工厂模式结合
 * public CashContext(String type) {
		switch (type) {
		case "正常收费":
			cashSupper = new CashNormal();
			break;
		case "打八折":
			cashSupper = new CashRebate("0.8");
			break;
		case "满300减100":
			cashSupper = new CashReturn("300", "100");
		default:
			break;
		}
	}
*/
	public double getResult(double money) {
		return cashSupper.acceptCash(money);
	}
}
