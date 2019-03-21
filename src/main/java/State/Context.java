package State;

public class Context {

	private State state;
	private int hour;
	private boolean finish = false;

	public Context(State state) {
		super();
		this.state = state;
	}

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void request() {
		state.Handle(this);
	}
}
