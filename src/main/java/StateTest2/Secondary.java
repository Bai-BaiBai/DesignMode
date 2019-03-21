package StateTest2;

public class Secondary implements Level {
	
	private static Secondary primary = new Secondary();
	
	private Secondary() {
		// TODO Auto-generated constructor stub
	}

	public static Secondary getInstance(){
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
		System.out.println("开启双倍得分，得分为：" + score*2);
		return score;
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
