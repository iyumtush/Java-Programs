package TushCodes;


public class Students {
	
private String name ; 
private int age;
public String getName() {
	
	return name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public void setName(String name) {
	this.name = name;
}

public static void main(String[] args) {
	Students s = new Students();
	s.setName("Tushar");
	s.setAge(21);
	
	System.out.println(s.getName());
	System.out.println(s.getAge());
}


}
