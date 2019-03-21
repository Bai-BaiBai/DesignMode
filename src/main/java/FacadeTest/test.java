package FacadeTest;

public class test {

	/***
	 * 在计算机主机（MainFrame）中，只需要按下主机的开机按钮(on())，就可以调用其他硬件设备和软件的启动方法，
	 * 如内存(Memory)的自检(check())，CPU的运行(run())，
	 * 硬盘(Harddisk)的读取(read())，操作系统(OS)的载入(load())等，
	 * 如果某一过程发生错误，则计算机启动失败
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("启动系统/");
		MainFrame mainFrame = new MainFrame();
		mainFrame.on();
	}

}
