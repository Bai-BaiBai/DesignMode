package Proxy;

public class Proxy implements GiveGift {

	private Pursuit p;

	public Proxy(ShoolGirl m) {
		p = new Pursuit(m);
	}

	@Override
	public void giveDolls() {
		// TODO Auto-generated method stub
		p.giveDolls();
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		p.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		p.giveChocolate();
	}

}
