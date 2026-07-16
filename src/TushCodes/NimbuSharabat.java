package TushCodes;

public class NimbuSharabat {

	void make() {
		System.out.println("Making of Nimbu Sharbat");
	}
}
	class Lemon extends NimbuSharabat {
	
	void cut() {
		System.out.println("Cut the lemon");
	}
	
	void squeeze() {
		System.out.println("Squeeze the Lemon ");
	}
	}
	
	class Water extends Lemon {
		
	void took() {
		System.out.println("Take Water in glass");
	}
	
	void add() {
		System.out.println("Add the Lemon squeezed juice water");
	} 
	}
	
	class Sugar extends Water {
		void put() {
			System.out.println("Put some sugar in the glass");
		
		}
	}
		
	class Movement extends Sugar {
		void stir() {
			System.out.println("Stir the mixture & you are good to go ");
		}
	
		
		
		}
	
	
	
	
	

	
	
	
	


