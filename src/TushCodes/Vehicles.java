package TushCodes;

public class Vehicles {

	void displayinfo() {
		System.out.println("This is Vehicle");
	}
	
	void fuelconsumption() {
		System.out.println("Vehicle fuel consumption");
	}
}
   class Car1 extends Vehicles {
	   
	   @Override
	void displayinfo() {
		System.out.println("This is car");
	}
   
	 @Override
	void fuelconsumption() {
		
		System.out.println("Car fuel consumption : 12 Km/L");
	}
	
   }
   
   class Bike1 extends Vehicles {
	   
	   @Override
	   void displayinfo() {
		   System.out.println("This is bike");
	   }
	   @Override
	   void fuelconsumption() {
		   System.out.println("Bike fuel consumption : 45 Km/L");
	   }
   
}


