package Prototype;

public class test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Resume aResume = new Resume("人员A");
		aResume.setPersonalInfo("1岁", "m");
		aResume.setWorkExperience("2010-2020", "A公司");

		Resume bResume = aResume.clone();
		bResume.setPersonalInfo("2岁", "w");
		bResume.setWorkExperience("2020-2030", "B公司");
		bResume.Display();
		aResume.Display();
	}

}
