package strategyTest;

public class LanguageBook implements Book {

	@Override
	public double getPrice(double money) {
		// TODO Auto-generated method stub
		return money - 2;
	}
}
