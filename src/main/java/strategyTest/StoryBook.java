package strategyTest;

public class StoryBook implements Book {

	public double getPrice(double money) {
		return money - Math.floor(money / 100) * 10;
	}
}
