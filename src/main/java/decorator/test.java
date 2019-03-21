package decorator;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person xc = new Person("小菜");
		
		Finarty pqx = new poqiuxie(xc);
		Finarty kk = new kuaku(pqx);
		Finarty dtx = new Tshirt(kk);
		dtx.show();
	}

}
