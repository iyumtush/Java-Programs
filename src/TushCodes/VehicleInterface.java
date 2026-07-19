package TushCodes;

public interface VehicleInterface {

	void start();
	void stop();
	
	
	default void honk() {
		System.out.println("Vehicle is Honking");
	}
	
	static void service() {
		System.out.println("Vehicle is being serviced");
		
	}
}
