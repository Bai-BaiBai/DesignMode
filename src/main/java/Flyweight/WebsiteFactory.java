package Flyweight;

import java.util.Hashtable;

public class WebsiteFactory {

	private Hashtable<String, Website> websites = new Hashtable<>();
	
	public Website getWebsite(String key) {
		if(!websites.containsKey(key)) {//如果Map里没有这个共享内容，就创建一个放进去再返回，否则直接返回
			websites.put(key, new ConcreteWebsite(key));
		}
		return websites.get(key);
	}
	
	public int getWebsiteCount() {
		return websites.size();
	}
}
