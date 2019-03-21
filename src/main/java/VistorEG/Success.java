package VistorEG;

public class Success extends Visitor {

	@Override
	public void getManConclusion(Person man) {
		// TODO Auto-generated method stub
		System.out.println(man.getClass().getSimpleName() + this.getClass().getSimpleName() + "高调");
	}

	@Override
	public void getWomanConclusion(Person woman) {
		// TODO Auto-generated method stub
		System.out.println(woman.getClass().getSimpleName() + this.getClass().getSimpleName() + "低调");
	}
}
