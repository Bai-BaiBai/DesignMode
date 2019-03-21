package StateTest;

public class Mp3On implements MP3State {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("已开机");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("执行关机");
	}

	@Override
	public void preSong() {
		// TODO Auto-generated method stub
		System.out.println("执行播放前一首歌");
	}

	@Override
	public void nextSong() {
		// TODO Auto-generated method stub
		System.out.println("执行播放后一首歌");
	}

	
}
