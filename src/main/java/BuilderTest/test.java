package BuilderTest;

public class test {
	
	/***
	 * 某软件公司要开发一个视频播放软件，为了给用户提供方便，该播放软件提供了多种界面显示模式，
	 * 如完整模式、精简模式、记忆模式、网络模式等。
	 * 在不同的显示模式下，主界面的组成元素有所差异，
	 * 如在完整模式下将显示菜单、播放列表、主窗口、控制条等，
	 * 在精简模式下只显示主窗口和控制条，
	 * 而在记忆模式下，将显示主窗口、控制条、收藏列表等。
	 * 试用建造者模式设计软件。
	 * 
	 * ps:这个题并不完美契合建造者模式，装饰模式、模板方法模式均可
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director = new Director();
		Mode mode = new CompleteMode(new Player());
		director.buildA(mode);
		mode.getResult().display();
	}

}
