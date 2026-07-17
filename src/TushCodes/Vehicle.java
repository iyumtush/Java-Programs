package TushCodes;



public class Vehicle {

	void start() {
		
		System.out.println("Vehicle is starting..");
	}
}
	class Car extends Vehicle{
		
		void drive() {
			System.out.println("Car is being driven");
		}
	}
		class Bike extends Vehicle{
			
		void ride() {
			System.out.println("The bike is being ridden");
		}
		

	

}


