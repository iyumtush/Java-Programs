package TushCodes;

public class PersonInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person p1 = new Person("Tushar" , 21);
		Person p2 = new Person("Ved" , 21);
		
		p1.showPersonName();
		p1.showPersonAge();
		p2.showPersonName();
		p2.showPersonAge();
		
		Person.showTotalPerson();
		
	}

}
