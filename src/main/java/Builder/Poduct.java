package Builder;

import java.util.ArrayList;
import java.util.List;

public class Poduct {

	private List<String> parts = new ArrayList<String>();
	
	public void add(String part) {
		parts.add(part);
	}
	
	public void show() {
		System.out.println("产品部件");
		for (String string : parts) {
			System.out.println(string);
		}
	}
}
