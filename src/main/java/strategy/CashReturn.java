package strategy;

public class CashReturn extends CashSupper {

	private double moneyCondition = 0.0d;
	private double moneyReturn = 0.0d;
	
	public CashReturn(String moneyCondition, String moneyReturn) {
		this.moneyCondition = Double.parseDouble(moneyCondition);
		this.moneyReturn = Double.parseDouble(moneyReturn);
	}

	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		if(money >= moneyCondition) {
			return money - Math.floor(money / moneyCondition) * moneyReturn;
		}else {
			return money;
		}
	}

}
