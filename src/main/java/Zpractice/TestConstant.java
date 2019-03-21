package Zpractice;

public class TestConstant {
    public static void main(String[] args) {
//        System.out.println(Test1.a);
//        System.out.println(Test1.s);
//      System.out.println(Test1.b);
      System.out.println(Test1.s1);
//      System.out.println(Test1.a3);
//      System.out.println(Test1.e);
    }
}

class Test1{
    static{
        System.out.println("Test正在被初始化");
    }
    public static final int a = 10;//编译
    public static final String s = "world";//编译
    public static final String s1 = a + s;//编译
    public static final int b = "test".length();//运行
    public static final Integer a2 = 20;//运行
    public static final A a3 = new A();
    public static final E e = E.A;
}
class A{

}
enum E{
    A,B,C,D,E,F,G
}
