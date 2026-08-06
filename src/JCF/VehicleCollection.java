package JCF;

public class VehicleCollection 
{
	private String name;
	private String type;
	private double price;
	
	public VehicleCollection
	(String name , String type , double price) 
	{	
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public String getname()
	{
		return name;
	}
	
	public String gettype()
	{
		return type;
	}
	
	public double price()
	{
		return price;
	}
	
	public String toString()
	{
		return "Vehicle[ Vehicle Name : "
				+ ""+name+" , Vehicle Type : "
				+type+" Vehicle Price : "
				+price+"]";
	}
	
}
