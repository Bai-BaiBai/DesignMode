package simplefactoryTest;

public class Nvwa {

	public static Person createPerson(String type) {
		Person p = null;
		
		switch (type) {
		case "m":
			p = new Man();
			break;
		case "w":
			p = new Woman();
			break;

		default:
			break;
		}
		return p;
	}
}
