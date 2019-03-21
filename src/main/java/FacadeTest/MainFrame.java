package FacadeTest;

public class MainFrame {

	private Memory memory;
	private CPU cpu;
	private Harddisk harddisk;
	private OS os;
	
	public MainFrame() {
		// TODO Auto-generated constructor stub
		memory = new Memory();
		cpu = new CPU();
		harddisk = new Harddisk();
		os = new OS();
	}
	
	public void on() {
		memory.check();
		cpu.run();
		harddisk.read();
		os.load();
	}
}
