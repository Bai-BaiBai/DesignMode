package Proxy;

public class Pursuit implements GiveGift {
	
	private ShoolGirl girl;
	
	public Pursuit(ShoolGirl girl) {
		this.girl = girl;
	}

	@Override
	public void giveDolls() {
		// TODO Auto-generated method stub
		System.out.println("送yww" + girl.getName());
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		System.out.println("送xh" + girl.getName());
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		System.out.println("送qkl" + girl.getName());
	}

}
