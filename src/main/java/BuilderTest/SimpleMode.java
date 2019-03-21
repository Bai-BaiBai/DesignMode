package BuilderTest;

public class SimpleMode extends Mode {

	public SimpleMode(Player player) {
		super(player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buildMenu() {
		// TODO Auto-generated method stub
		player.add("简单模式的主窗口");
	}

	@Override
	public void buildList() {
		// TODO Auto-generated method stub
		player.add("简单模式的播放列表");
	}

	@Override
	public void buildMainFace() {
		// TODO Auto-generated method stub
		player.add("简单模式的主页面");
	}

	@Override
	public void buildControl() {
		// TODO Auto-generated method stub
		player.add("简单模式的控制条");
	}

	@Override
	public void buildCollect() {
		// TODO Auto-generated method stub
		player.add("简单模式的收藏列表");
	}

	@Override
	public Player getResult() {
		// TODO Auto-generated method stub
		return player;
	}
}
