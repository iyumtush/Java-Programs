package OPP;

public class Main {

	public static void main(String[] args) {

		Human my = new Human();
		
		System.out.println(my.name);
		System.out.println(my.age);
		
		my.eat();
		my.run();
		String name = "Tushar";

		jump(name);

	}

	static void jump(String name)
	{
		System.out.println(name+" can jump");
	}

}
