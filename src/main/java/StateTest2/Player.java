package StateTest2;

public class Player {

	private Level level;
	private int score = 0;
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void startGame(int score) {
		if(this.score >= 2000) {
			this.level = Final.getInstance();
		}else if (this.score >= 1000) {
			this.level = Professional.getInstance();
		}else if (this.score >= 500) {
			this.level = Secondary.getInstance();
		}else {
			this.level = Primary.getInstance();
		}
		this.score += level.basePlay(score);;
	}
	
	public void getDouble(int score) {
		this.score += level.doubleScore(score);;
	}
	public void changeCard() {
		level.changeCards();
	}
	
	public void peekCard() {
		level.peekCards();
	}
}
