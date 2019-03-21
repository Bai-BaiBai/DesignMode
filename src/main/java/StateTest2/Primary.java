package StateTest2;

public class Primary implements Level {
	
	private static Primary primary = new Primary();
	
	private Primary() {
		// TODO Auto-generated constructor stub
	}

	public static Primary getInstance(){
		return primary;
	}
	
	@Override
	public int basePlay(int score) {
		// TODO Auto-generated method stub
		System.out.println("完成一局游戏，得分为：" + score);
		return score;
	}

	@Override
	public int doubleScore(int score) {
		// TODO Auto-generated method stub
		System.out.println("得分累计500达到Secondary玩家可解锁");
		return 0;
	}

	@Override
	public void changeCards() {
		// TODO Auto-generated method stub
		System.out.println("得分累计1000达到Professional玩家可解锁");
	}

	@Override
	public void peekCards() {
		// TODO Auto-generated method stub
		System.out.println("得分累计2000达到Final玩家可解锁");
	}

}
