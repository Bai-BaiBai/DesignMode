package CARP;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandsetBrand aBrand;
		aBrand = new HandsetBrandA();
		
		aBrand.setSoft(new HandsetGame());
		aBrand.run();
		aBrand.setSoft(new HandsetAddressList());
		aBrand.run();
		
	}
}
