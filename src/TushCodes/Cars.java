package TushCodes;

public class Cars implements VehicleInterface{

	@Override
	public void start() {
		System.out.println(" Car is Starting... ");
	}

	@Override
	public void stop() {
		System.out.println("Car is Stopping...");
		
	}

	//Additional Method
	public void drift() {
		System.out.println("Car is drifting");
	}
}
