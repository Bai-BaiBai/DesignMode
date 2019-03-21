package BuilderTest;

public abstract class Mode {

	protected Player player;
	
	public Mode(Player player) {
		super();
		this.player = player;
	}
	
	public Player getPlayer() {
		return player;
	}

	public abstract void buildMenu();
	public abstract void buildList();
	public abstract void buildMainFace();
	public abstract void buildControl();
	public abstract void buildCollect();
	public abstract Player getResult();
}
