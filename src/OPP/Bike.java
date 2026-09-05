package OPP;

public class Bike {
	
	String name;
	int modelYear;
	String companyName;
	int price;
	
    Bike(String name,int modelYear , String companyName,int price)
    {
    	this.name = name;
    	this.modelYear = modelYear;
    	this.companyName = companyName;
    	this.price = price;
    }
    
    
    public String toString() // 
    {
    	return name+"\n"+modelYear+"\n"+companyName+"\n"+price;
    }
    
	public static void main(String[] args) {

		Bike bike = new Bike("Kawasaki" , 2020 , "Suzuki" , 3400000);
		
		System.out.println(bike.toString());
		System.out.println(bike);
	}

}
