package TushCodes;

public class ExOfConstructor {

	
	class Car {
		
		String name ;
		int price ;
	
	    Car(String name , int price){
		
	this.name = name;
	this.price = price;
}
    
    void displayinfo() {
    	
    	System.out.println("The Name Of Car is "+name+" and price is $"+price+" dollers");
    }
    
	}
}
