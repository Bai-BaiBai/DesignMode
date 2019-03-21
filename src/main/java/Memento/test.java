package Memento;

public class test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameRole lixiaoyao = new GameRole();
		lixiaoyao.getInitState();
		lixiaoyao.stateDisplay();
		
		RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
		stateAdmin.setMemento("第一次存档",lixiaoyao.saveState());
		
		lixiaoyao.fight();
		lixiaoyao.stateDisplay();
		stateAdmin.setMemento("第二次存档",lixiaoyao.saveState());
		
		lixiaoyao.recoveryState(stateAdmin.getMemento("第一次存档"));
		lixiaoyao.stateDisplay();
		lixiaoyao.recoveryState(stateAdmin.getMemento("第二次存档"));
		lixiaoyao.stateDisplay();
	}
}
