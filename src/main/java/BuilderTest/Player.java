package BuilderTest;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Object> parts = new ArrayList<>();
	
	public void add(Object part) {
		parts.add(part);
	}
	
	public void display() {
		System.out.println("这个播放器有");
		for (Object object : parts) {
			System.out.println(object);
		}
	}
}
