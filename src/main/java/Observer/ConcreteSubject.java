package Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject extends Subject{

	
	private List<Observer> observers = new ArrayList<>();
	
	public void addObs(Observer observer) {
		observers.add(observer);
	}
	public void delObs(Observer observer) {
		observers.remove(observer);
	}
	public void Notify() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
