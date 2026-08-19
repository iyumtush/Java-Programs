package TushCodes;

public class Vehiclesinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicles v = new Vehicles();
		Car1 c  = new Car1();
		Bike1 b = new Bike1();
		
		//Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs concept. Inheritance represents the IS-A relationship.
		v.displayinfo();
		v.fuelconsumption();
		c.displayinfo();
		c.fuelconsumption();
	    b.displayinfo();
	    b.fuelconsumption();
		
	}

}
