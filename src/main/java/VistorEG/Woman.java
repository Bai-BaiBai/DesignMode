package VistorEG;

public class Woman extends Person {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.getWomanConclusion(this);
	}
}
