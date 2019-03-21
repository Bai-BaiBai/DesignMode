package strategyTest;

public class test {

	/**
	 * 设计一个网上书店，该系统中所有的计算机图书（ComputerBook），每本都有10%的折扣；
	 * 所有的语言类图书(LanguageBook)，每本有2元的折扣；
	 * 小说类图书以每100元有10元的折扣，
	 * 用策略模式设计该系统
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double money = 520d;
		Book book = new ComputerBook();
		BookContext bookContext = new BookContext(book);
		System.out.println(bookContext.getPrice(money));
	}

}
