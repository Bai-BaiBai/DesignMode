package StateTest;

public class Mp3Off implements MP3State {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("执行开机");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("关机状态，请先开机");
	}

	@Override
	public void preSong() {
		// TODO Auto-generated method stub
		System.out.println("关机状态，请先开机");
	}

	@Override
	public void nextSong() {
		// TODO Auto-generated method stub
		System.out.println("关机状态，请先开机");
	}

}
