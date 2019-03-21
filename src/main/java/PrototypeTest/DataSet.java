package PrototypeTest;

public class DataSet implements Cloneable{

	private String set = "要显示的数据";

	public String getSet() {
		return set;
	}

	public void setSet(String set) {
		this.set = set;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
