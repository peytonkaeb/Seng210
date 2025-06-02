package starsShapes;
import java.util.Scanner;

public class starsShapes {

	public static void main(String[] args) {




		        Scanner scan = new Scanner(System.in);

		       

		            System.out.println("Welcome to the password program. Here are the rules: \n1. The password must be 8 characters long. \n2. the password must contain a small letter, a capital letter, a digit, and a symbol from the group (*,$,_).");

		            System.out.println("Insert a password:");

		            String passwordInserted = scan.next();

		            if(passwordInserted.length() < 8 || passwordInserted.length() < 8){

		                System.out.print("Invalid. Password must be 8 characters");

		           

		            }
		                  /*  if (passwordInserted.length() < 8){
		                     System.out.println("Invalid. Password must contain one of the symbols: *$_");
		                    } */


		            for(int i = 0; i < passwordInserted.length(); i++){

		                if (passwordInserted.charAt(i) == '*' || passwordInserted.charAt(i) == '$' || passwordInserted.charAt(i) == '_'){

		                    System.out.println("valid");

		                    System.out.println("Have a good day!");
		               
		                    break;
		                }
		                   
		                }

		            }



		        }
