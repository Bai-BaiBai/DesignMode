package VistorEG;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

//	private List<Element> elements = new ArrayList<>();
//	
//	public void addElement(Element element) {
//		elements.add(element);
//	}
//	
//	public void visit(Visitor visitor) {
//		for (Element element : elements) {
//			element.accept(visitor);
//		}
//	}
	
	private List<Person> persons = new ArrayList<>();
	
	public void addPerson(Person person) {
		persons.add(person);
	}
	
	public void display(Visitor visitor) {
		for (Person person : persons) {
			person.accept(visitor);
		}
	}
}
