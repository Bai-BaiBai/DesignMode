package decoratorTest;

public class test {
	
	/**
	 * 简单的手机（SimplePhone）在接收到来电的时候，会发出声音来提醒主人，而现在我们需要为该手机添加一项功能，
	 * 在接收来电的时候，除了有声音，还能产生震动（JarPhone），
	 * 还可以得到更加高级的手机（ComplexPhone），来电时，它不仅能够发声，产生震动，而且有灯光闪烁提示，
	 * 使用装饰模式来模拟手机功能的升级过程
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone simplePhone = new SimplePhone();
		Phone jarPhone = new JarPhone(simplePhone);
		Phone complex = new ComplexPhone(jarPhone);
		
		complex.called();
	}

}
