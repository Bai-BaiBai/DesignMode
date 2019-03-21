package Memento;

import java.util.HashMap;
import java.util.Map;

public class RoleStateCaretaker {

	private Map<String,RoleStateMemento> mementos;
//	private RoleStateMemento memento;

	public RoleStateCaretaker() {
		// TODO Auto-generated constructor stub
		this.mementos = new HashMap<>();
	}
	
	public RoleStateMemento getMemento(String key) {
		return mementos.get(key);
	}
	
	public void setMemento(String key,RoleStateMemento memento) {
		mementos.put(key, memento);
	}
}
