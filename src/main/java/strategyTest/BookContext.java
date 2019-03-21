package strategyTest;

public class BookContext {

	private Book book;

	public BookContext(Book book) {
		this.book = book;
	}
	
	public double getPrice(double money) {
		return book.getPrice(money);
	}
}
