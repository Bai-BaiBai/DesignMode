package StateTest;

public class test {

	/**
	 * MP3有开机状态和关机状态，功能有开机、关机、播放前一首歌、播放后一首歌
	 * 在开机状态下不能执行开机动作，关机状态下不能执行播放动作、关机动作
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MP3State state = new Mp3Off();
		Context context = new Context();
		context.setState(state);
		context.powerOff();
		context.powerOn();
		context.powerOff();
		context.preSong();
		context.powerOn();
		context.nextSong();
	}

}
