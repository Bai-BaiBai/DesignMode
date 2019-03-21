package simplefactoryTest;

public class test {

	/**
	 * 使用简单工厂模式模拟女娲（Nvwa）造人(Person)，
	 * 如果传入参数M，则返回一个Man对象，如果传入参数W。则返回一个对象Woman，
	 * 用java语言实现该场景。现在需要增加一个新的Robot类，如果传入参数R,则返回一个Robot对象，对代码进行修改并注意女娲的变化。 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = Nvwa.createPerson("w");
		person.say();
		person = Nvwa.createPerson("m");
		person.say();
	}

}
