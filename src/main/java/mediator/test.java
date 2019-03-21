package mediator;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecurityCouncil UNSC = new SecurityCouncil();
		USA usa = new USA(UNSC);
		Iraq iraq = new Iraq(UNSC);
		UNSC.setCountry1(usa);
		UNSC.setCountry2(iraq);
		
		usa.declare("usa");
		iraq.declare("iraq");
	}

}
