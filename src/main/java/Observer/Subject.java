package Observer;

public abstract class Subject {	

	private String subjectState;//通知者内部状态
	
	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
	public abstract void addObs(Observer observer);//添加观察者
	public abstract void delObs(Observer observer);//移除观察者
	public abstract void Notify();//通知观察者,调用观察者的更新方法
	
}
