package TushCodes;



class BoilWater extends Thread {
	
	public void run()  {
		System.out.println("Boiling Water");
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    System.out.println("Water is Ready");
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    System.out.println("Milk is ready");
	}
	
	
	
	
}

class GrindCoffee extends Thread{
	
	public void run()  {
		
		System.out.println("Grinding Coffee Beans");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Coffee is powder is ready");
	}
}


class BoilMilk extends Thread {
	public void run()  {
		System.out.println("Boiling Milk");
	}
}


public class CoffeeMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BoilWater water = new BoilWater();
		BoilMilk milk = new BoilMilk();
		GrindCoffee coffee = new GrindCoffee();
		
		
		water.start();
		
		try {
			water.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		milk.start();
		
		try {
			milk.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		coffee.start();
		
		try {
			coffee.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" ☕ ️Coffee is ready");
	}

}
