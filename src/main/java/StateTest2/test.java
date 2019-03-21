package StateTest2;

public class test {

	/**
	 * 某纸牌游戏中，人物角色具有入门级（Primary），熟练级(Secondary)，高手级(Professional)和骨灰级(Final)四种等级，
	 * 角色的等级与积分相对应，游戏胜利将增加积分，失败则扣除积分，
	 * 入门级具有最基本的游戏功能play()，
	 * 熟练级增加了游戏胜利积分加倍功能doubleScore（），
	 * 高手级在熟练级基础上再增加换牌功能changeCards()，
	 * 骨灰级在高手级基础上再增加偷看他人的牌的功能peekCards()，
	 * 使用状态模式来设计系统 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player player = new Player();
		player.startGame(300);
		player.getDouble(300);
		player.changeCard();
		player.peekCard();
		System.out.println(player.getScore());
		System.out.println("-----------------");
		player.startGame(300);
		player.getDouble(300);
		player.changeCard();
		player.peekCard();
		System.out.println(player.getScore());
		System.out.println("-----------------");
		player.startGame(300);
		player.getDouble(300);
		player.changeCard();
		player.peekCard();
		System.out.println(player.getScore());
		System.out.println("-----------------");
		player.startGame(300);
		player.getDouble(300);
		player.changeCard();
		player.peekCard();
		System.out.println(player.getScore());
		System.out.println("-----------------");
		player.startGame(300);
		player.getDouble(300);
		player.changeCard();
		player.peekCard();
		System.out.println(player.getScore());
		System.out.println("-----------------");
		player.startGame(300);
		player.getDouble(300);
		player.changeCard();
		player.peekCard();
		System.out.println(player.getScore());
		System.out.println("-----------------");
	}

}
