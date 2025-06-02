package task2;


	import java.util.Scanner;
	public class validatePassword {


	public static void passwordCheck() {
		
	Scanner scan = new Scanner(System.in);
	boolean validPassword = false;
	boolean symbol = false;


	while(!validPassword){
	   System.out.println("\nEnter a Password:");
	   String passwordInserted = scan.next();
	  
	   for(String num : fileRead.fileUsernames) {
			  if(num.equals(passwordInserted)) {
				  validPassword = true;
			  }
	   }
	  
	   boolean length = passwordInserted.length() >= 8;
	  for(int i = 0; i < passwordInserted.length(); i++){
	        if (passwordInserted.charAt(i) == '*' || passwordInserted.charAt(i) == '$' || passwordInserted.charAt(i) == '_'){
	          
	             symbol = true;
	     
	             break;
	        }
	  }
	        if(validPassword) {
	  		  System.out.println("Correct Password");
	  	  }
	  	  if(validPassword == false) {
	  		  System.out.println("Invalid");
	  		  if(!symbol) {
	  			  System.out.println("Password must contain *, $ or _");
	  		  }
	  		  if(!length) {
	  			  System.out.println("Password must be 8 characters long");
	  		  }
	  	 
	        }
	        }
	       }



	 //  scan.close();
	   }

