package Zpractice;

public class Parent {

	int a = 10;
	static int b = 11;
	
	//静态代码块
	static {
		System.out.println("Parent静态代码块：b=" + b);
		b++;
	}
	
	//代码块
	{
		System.out.println("Parent代码块:a=" + a);
		System.out.println("Parent代码块:b=" + b);
		a++;
		b++;
	}
	
	//无参构造方法
	public Parent(){
		System.out.println("Parent无参构造方法：a=" + a);
		System.out.println("Parent无参构造方法：b=" + b);
	}
	
	//有参构造方法
	public Parent(int a) {
		System.out.println("Parent有参构造方法：a=" + a);
		System.out.println("Parent有参构造方法：b=" + b);
	}
	
	//方法
	public void function() {
		System.out.println("Parent function run......");
	}
}
