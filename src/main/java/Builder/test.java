package Builder;

public class test {

	public static void main(String[] args) {

		Director director = new Director();
		Builder builder1 = new ConcreteBuilder1();
		Builder builder2 = new ConcreteBuilder2();
		//用ConcreteBuilder1的方法来建造产品
		director.constructPoduct(builder1);
		builder1.getResult().show();
		//用ConcreteBuilder2的方法来建造产品
		director.constructPoduct(builder2);
		builder2.getResult().show();
	}
}
