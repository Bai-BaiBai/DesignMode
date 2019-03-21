package Memento;

public class RoleStateMemento {

	private int vitlity;
	private int attack;
	private int defense;
	
	public RoleStateMemento(int vitlity, int attack, int defense) {
		super();
		this.vitlity = vitlity;
		this.attack = attack;
		this.defense = defense;
	}

	public int getVitlity() {
		return vitlity;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

}
