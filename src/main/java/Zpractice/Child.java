package Zpractice;

public class Child extends Parent {

	int x = 10;
	static int y = 11;
	
	//静态代码块
	static {
		System.out.println("Child静态代码块：y=" + y);
		y++;
	}
	
	//代码块
	{
		System.out.println("Child代码块：x=" + x);
		System.out.println("Child代码块：y=" + y);
		x++;
		y++;
	}
	
	//Child构造方法
	public Child() {
		// TODO Auto-generated constructor stub
		System.out.println("Child构造方法 x=" + x);
		System.out.println("Child构造方法 y=" + y);
	}
	
	public void function() {
		System.out.println("Child function run......");
	}
}
