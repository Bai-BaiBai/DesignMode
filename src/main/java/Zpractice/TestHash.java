package Zpractice;

import java.util.HashMap;
import java.util.Map;

public class TestHash {
	
	private static class Person{
		int idCard;
		String name;
		
		public Person(int idCard, String name) {
			// TODO Auto-generated constructor stub
			this.idCard = idCard;
			this.name = name;
		}
		
		public boolean equals(Object object) {
			if(this == object) {
				return true;
			}
			if(object == null || this.getClass() != object.getClass()) {
				return false;
			}
			Person person = (Person)object;
			return this.idCard == person.idCard;
		}
		public int hashCode() {
			return idCard;
		}
	}
	
	private static void addOne(String string) {
		string += "addOne";
		System.out.println(string);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Person, String> hash = new HashMap<>();
		Person person = new Person(1234, "a");
		hash.put(person, "测试");
		
		System.out.println(hash.get(new Person(1234, "b")));
		
		String str1 = "Hello";  
	    String str2 = new String("Hello");
	    System.out.print(str1 == str2);
	    System.out.print(str1.equals(str2));
	}

}
