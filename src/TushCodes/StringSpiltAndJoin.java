package TushCodes;

public class StringSpiltAndJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//String Join 
		
		
        String Word [] = {"In" , "Cyclo" , "Pedia"};
		
		String JoinWord = String.join("" , Word)	;
		
		System.out.println(JoinWord);
		

		// String Spilter 
		
		String Sentence = ("Hello Tushar ! How are you ?");
		
		String words [] = Sentence.split(" ");
		
		for(int i = 0 ; i<words.length;i++){
			
			System.out.println(words[i]);
			

			
		}
		
		
	}
	
	

}


//String Join 

   
