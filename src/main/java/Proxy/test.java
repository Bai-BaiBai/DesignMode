package Proxy;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoolGirl jiaojiao = new ShoolGirl("ljj");
		
		Proxy daili = new Proxy(jiaojiao);
		daili.giveChocolate();
		daili.giveDolls();
	}

}
