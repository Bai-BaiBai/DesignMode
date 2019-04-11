package Zpractice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Tes.age);
//		System.out.println(Tes.name);
//		System.out.println(Tes.score);
//		Tes.test();
		try {
			Class.forName("Zpractice.Child");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String aString = new String("xyz");
		String bString = new String("xyz");
		System.out.println(aString == bString);
	}
}	
	
class Tes{
	public static double age = 23d;//有final不初始化;无final 初始化
	public static final String name = "chongqing"; //有final修饰不初始化；无final修饰初始化  编译常量
	public static final Integer score = 85;//有final 初始化；无final初始化			   不是编译常量
	
	
	static {
		System.out.println("Tes static block");
	}
	{
		System.out.println("Tes block");
	}
	
	public static void test() {
		System.out.println("Tes static function");
	}
}