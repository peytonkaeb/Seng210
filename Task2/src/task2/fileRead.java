package task2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class fileRead {
    public static ArrayList<String> fileUsernames = new ArrayList<>();

    public fileRead(String fileName) throws IOException {
        // Declare resources outside the try-catch block
        FileInputStream file = null;
        Scanner fileScan = null;

        try {
            // Opening and reading from file
            file = new FileInputStream(fileName);
            fileScan = new Scanner(file);

            // Check if the file is empty
            if (!fileScan.hasNext()) {
                throw new IOException("The file is empty.");
            }

            // Read the number of users
            if (!fileScan.hasNextInt()) {
                throw new IOException("File format is incorrect. First line should contain an integer.");
            }
            int numUsers = fileScan.nextInt(); // Assuming the first line is the number of users

            // Read the usernames and passwords
            for (int i = 0; i < numUsers; i++) {
                if (fileScan.hasNext()) {
                    fileUsernames.add(fileScan.next()); // Assuming the username is the first word
                    fileScan.next(); // Skip password (or you can store it if needed)
                }
            }

        } catch (FileNotFoundException excpt) {
            System.out.println("Unfortunately the file is not found.");
            throw excpt;  // Rethrow exception if needed

        } catch (IOException excpt) {
            System.out.println("An error occurred while reading the file: " + excpt.getMessage());
            throw excpt;  // Rethrow exception if needed
        } finally {
            // Close resources only if they were initialized and are not null
            if (fileScan != null) {
                fileScan.close();
            }
            if (file != null) {
                file.close();
            }
        }
    }

    // Method to print the usernames from the file
    public static void filePrint() {
        for (String value : fileUsernames) {
            System.out.println(value);
        }
    }
}