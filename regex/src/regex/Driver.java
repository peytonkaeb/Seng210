/*package regex;
import java.io.Console;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Driver {
public static void main(String[] args){
    
Scanner in= new Scanner(System.in);
while (true) {
System.out.print("\nEnter your regex: ");
Pattern pattern = Pattern.compile(in.next());
System.out.print("Enter input string to search: ");
Matcher matcher = pattern.matcher(in.next());
boolean found = false;
while (matcher.find()) {
System.out.printf("I found the text" +
" \"%s\" starting at " +
"index %d and ending at index %d.%n",
matcher.group(),
matcher.start(),
matcher.end());
found = true;
}
if(!found){
System.out.printf("No match found.%n");
}
}
}
} */

package regex;
import java.io.Console;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Driver {
    public static void main(String[] args){
    
        Scanner in = new Scanner(System.in);
        while (true) {
            // Read the regex as a whole line
            System.out.print("\nEnter your regex: ");
            String regex = in.nextLine();
            Pattern pattern = Pattern.compile(regex);
            
            // Read the input string as a whole line
            System.out.print("Enter input string to search: ");
            String inputString = in.nextLine();
            
            Matcher matcher = pattern.matcher(inputString);
            boolean found = false;
            while (matcher.find()) {
                System.out.printf("I found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
                found = true;
            }
            if (!found) {
                System.out.printf("No match found.%n");
            }
        }
    }
}