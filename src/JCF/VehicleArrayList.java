package JCF;
import java.util.*;
public class VehicleArrayList 
{

	public static void main(String[] args)
	{
		ArrayList<VehicleCollection> vehicleList = new ArrayList<>();
		
		vehicleList.add(new VehicleCollection
				("BMW" , "Car", 25000000.00));
		vehicleList.add(new VehicleCollection
				("Kawasaki Ninja H2R" , "Bike", 300000.00));
		vehicleList.add(new VehicleCollection
				("AshokLeyland" , "Truck", 1000000.00));
		vehicleList.add(new VehicleCollection
				("Doodle" , "ECycle", 25000.00));
		
		System.out.println("My Vehicle Collection list : ");
		for(VehicleCollection vehicle: vehicleList)
		{
			System.out.println(vehicle);
		}
	}

}
