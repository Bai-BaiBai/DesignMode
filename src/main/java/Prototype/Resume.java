package Prototype;

public class Resume implements Cloneable {

	private String name;
	private String age;
	private String sex;
	private WorkExperience workExperience;
	
	public Resume(String name) {
		this.name = name;
		workExperience = new WorkExperience();
	}
	
	public void setPersonalInfo(String age, String sex) {
		this.age = age;
		this.sex = sex;
	}
	
	public void setWorkExperience(String timeArea, String company) {
		workExperience.setTimeArea(timeArea);
		workExperience.setCompany(company);
	}
	
	public void Display() {
		System.out.println(name + age + sex);
		System.out.println(workExperience.getTimeArea() + workExperience.getCompany());
	}
	
	public Resume clone() throws CloneNotSupportedException {//注意深复制
		Resume aResume = (Resume) super.clone();
		aResume.workExperience = workExperience.clone();
		return aResume;
	}
}
