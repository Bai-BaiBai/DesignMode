package VistorEG;

public class Man extends Person {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.getManConclusion(this);
	}
}
