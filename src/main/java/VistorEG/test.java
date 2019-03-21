package VistorEG;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectStructure oStructure = new ObjectStructure();
		oStructure.addPerson(new Man());
		oStructure.addPerson(new Woman());
		
		Success success = new Success();
		oStructure.display(success);
	}
}
