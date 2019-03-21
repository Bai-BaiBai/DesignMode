package Prototype;

public class WorkExperience implements Cloneable {

	private String timeArea;
	private String company;
	public String getTimeArea() {
		return timeArea;
	}
	public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public WorkExperience clone() throws CloneNotSupportedException {
		return (WorkExperience) super.clone();
	}
}
