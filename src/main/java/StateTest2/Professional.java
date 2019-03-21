package StateTest2;

public class Professional implements Level {

	private static Professional primary = new Professional();
	
	private Professional() {
		// TODO Auto-generated constructor stub
	}

	public static Professional getInstance(){
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
		System.out.println("开启换牌");
	}

	@Override
	public void peekCards() {
		// TODO Auto-generated method stub
		System.out.println("得分累计2000达到Final玩家可解锁");
	}

}
