package TushCodes;

public class VehicleNCarApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cars mycar = new Cars();
		
		mycar.start();
		mycar.stop();
		mycar.drift();
		mycar.honk();
		
		VehicleInterface.service();
		
		

	}

}
