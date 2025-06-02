package task2;


	import java.util.Scanner;
	public class validateUsername {
	    public static void usernameLength(String username) {
	        Scanner scnr = new Scanner(System.in);
	        boolean validUsername = false;
	        boolean usernameMatch = false;

	        while (!validUsername) {
	            if (username.length() >= 6 && username.length() <= 8) {
	                validUsername = true;
	            } else {
	                System.out.println("Incorrect username, try again");
	                System.out.println("Enter a username:");
	                username = scnr.next();
	            }

	            for (String num : fileRead.fileUsernames) {
	                if (num.equals(username)) {
	                    usernameMatch = true;
	                    validUsername = true;
	                    break;
	                }
	            }
	            if (!usernameMatch) {
	                System.out.println("Username not found in the system, try again");
	            }
	        }
	    }
	}