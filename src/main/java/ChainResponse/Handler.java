package ChainResponse;

public abstract class Handler {

	protected Handler nextHandler;//设置这个处理者的下一个处理者，将请求传递下去

	public Handler(Handler handler) {
		super();
		this.nextHandler = handler;
	}
	
	public abstract void handle(String type, int num);//
}
