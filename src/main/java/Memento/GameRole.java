package Memento;

public class GameRole {

	private int vitality;
	private int attact;
	private int defense;
	
	public void getInitState() {
		this.vitality = 100;
		this.attact = 100;
		this.defense = 100;
	}
	
	public void stateDisplay() {
		System.out.println("当前状态 ：" + vitality + attact + defense);
	}
	
	public void fight() {
		this.vitality = 0;
		this.attact = 0;
		this.defense = 0;
	}
	
	public RoleStateMemento saveState() {
		return new RoleStateMemento(vitality, attact, defense);
	}
	
	public void recoveryState(RoleStateMemento memento) {
		this.vitality = memento.getVitlity();
		this.attact = memento.getAttack();
		this.defense = memento.getDefense();
	}
}
