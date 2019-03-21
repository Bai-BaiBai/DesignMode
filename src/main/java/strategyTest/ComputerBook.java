package strategyTest;

public class ComputerBook implements Book {

	@Override
	public double getPrice(double money) {
		// TODO Auto-generated method stub
		return money * 0.9;
	}

}
