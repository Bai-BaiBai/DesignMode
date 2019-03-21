package StateTest2;

public class Final implements Level {

	private static Final primary = new Final();
	
	private Final() {
		// TODO Auto-generated constructor stub
	}

	public static Final getInstance(){
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
		System.out.println("开始偷看");
	}

}
