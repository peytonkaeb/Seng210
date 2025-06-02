package task2;
import java.io.IOException;
import java.util.Scanner;

public class driver {
    public static void main (String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        // Instantiate fileRead class to read from the file
        fileRead reader = new fileRead("confidentialinfo.txt");

        // Welcome message and rules
        System.out.println("Welcome to the password program. Here are the rules: \n1. The Username must be 6-8 characters long \n2. The password must be 8 characters long. \n3. the password must contain a small letter, a capital letter, a digit, and a symbol from the group (*,$,_).");
        
        // Inputting username
        System.out.println("Enter a username:");
        String usernameInserted = scan.next();

        // Validating username
        validateUsername.usernameLength(usernameInserted);

        // Validating password
        validatePassword.passwordCheck();
    }
}









