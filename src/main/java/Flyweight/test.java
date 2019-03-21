package Flyweight;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebsiteFactory factory = new WebsiteFactory();
		Website website1 = factory.getWebsite("产品展示");
		website1.use(new User("一号"));
		
		Website website2 = factory.getWebsite("产品展示");
		website2.use(new User("二号"));
		
		Website website3 = factory.getWebsite("博客展示");
		website3.use(new User("三号"));
		
		Website website4 = factory.getWebsite("博客展示");
		website4.use(new User("四号"));
		System.out.println(factory.getWebsiteCount());
		System.out.println(website1 == website2);
	}
}
