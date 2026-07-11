package TushCodes;

public class StringBuilderAndBuffer {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		StringBuffer name = new StringBuffer("Tushar"); 
		
		name.append( " Ingale"); // it add and chnage the string add another string
		
		System.out.println(name);
		
		name.insert(0, "Mrs."); // it add Mrs. at index 0
        System.out.println(name);
        
        name.delete(0, 4);  // it deletes the character from index 0 to 4
        System.out.println(name);
        
        name.reverse();
        System.out.println(name);
        
        
        
        // StringBuilder
        
        StringBuilder str2 = new StringBuilder("Java");
        
        //Similiar commands can be use here as well as as used in Buffer 
        
        
       //The difference is Buffer is Thread safe & Builder is Not Thread Safe
        
        
	}

}
