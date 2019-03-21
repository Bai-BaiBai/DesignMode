package StateTest;

public class Context {

	private MP3State state;

	public void setState(MP3State state) {
		this.state = state;
	}
	
	public void powerOn() {
		state.powerOn();
		setState(new Mp3On());
	}
	
	public void powerOff() {
		state.powerOff();
		setState(new Mp3Off());
	}
	
	public void preSong() {
		state.preSong();
	}
	
	public void nextSong() {
		state.nextSong();
	}
}
