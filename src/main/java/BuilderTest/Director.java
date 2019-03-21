package BuilderTest;

public class Director {

	public void buildA(Mode mode) {
		mode.buildCollect();
		mode.buildControl();
		mode.buildList();
	}
	
	public void buildB(Mode mode) {
		mode.buildMainFace();
		mode.buildMenu();
	}
}
