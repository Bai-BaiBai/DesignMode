package Observer;

public class ConcreteObserver implements Observer {

	private String name;//非必需
	private String observerState;//观察者的当前状态
	private Subject concreteSubject;//非必需
	
	public ConcreteObserver(String name, Subject concreteSubject) {
		super();
		this.name = name;
		this.concreteSubject = concreteSubject;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		observerState = concreteSubject.getSubjectState();//这里将通知者的状态赋给了观察者状态，非必需
		System.out.println(name + "观察者的新状态为" + observerState);
	}
}
