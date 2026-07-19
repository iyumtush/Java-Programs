package TushCodes;



public class ExOfConstructerObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExOfConstructor obj = new ExOfConstructor();

		ExOfConstructor.Car c = obj.new Car("BMW", 3000);

		c.displayinfo();
		
		 
	}

}
