package JCF;

import java.util.LinkedList;

public class VehicleLinkList 
{
	public static void main(String[] args) 
	{
		///Using Linked List----->
		LinkedList<VehicleCollection> PremiumvehicleList = new LinkedList<>();
		
		PremiumvehicleList.add(new VehicleCollection("Supra" , "Car" , 4000000));
		PremiumvehicleList.add(new VehicleCollection("Porsche" , "Car" , 5000000));
		PremiumvehicleList.add(new VehicleCollection("Bugati" , "Car" , 10000000));
		PremiumvehicleList.add(new VehicleCollection("Meserati" , "Car" , 9000000));
		
		System.out.println("Vehicle Collection using LinkedList:");
		for(VehicleCollection PremiumVehicle : PremiumvehicleList) 
		{
			System.out.println(PremiumVehicle);
		}
		
		System.out.println(" ");
		//To print the item from linked list with its index
		VehicleCollection supra = PremiumvehicleList.get(0);
		System.out.println("Output as per the specfic index print : " +supra);
		
		//To remove the item from linked list we can use remove (last , first)
		VehicleCollection Last = PremiumvehicleList.removeLast();
		
		System.out.println(" ");
		System.out.println("Vehicle Collection using LinkedList:");
		for(VehicleCollection PremiumVehicle : PremiumvehicleList) 
		{
			System.out.println(PremiumVehicle);
		}
		
	}
}
