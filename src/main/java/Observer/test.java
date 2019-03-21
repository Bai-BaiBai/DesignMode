package Observer;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcreteSubject subject = new ConcreteSubject();
		subject.addObs(new ConcreteObserver("A", subject));
		subject.addObs(new ConcreteObserver("B", subject));
		subject.addObs(new ConcreteObserver("C", subject));
		subject.setSubjectState("状态：asd");
		subject.Notify();
	}

}
