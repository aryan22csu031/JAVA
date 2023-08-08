import java.io.*;
import java.util.*;

class PasswordGenerator {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the desired length of the password
        System.out.println("Enter the desired length of the password:");
        int passwordLength = sc.nextInt();

        // Generate the password
        String password = generatePassword(passwordLength);

        // Display the generated password
        System.out.println("Generated Password:");
        System.out.println(password);

        // Write the generated password to a file
        File file = new File("password.txt");
        FileWriter writer = new FileWriter(file);
        writer.write(password);
        writer.close();

        // Calculate the score of the generated password and display a message accordingly
        int score = calculatePasswordScore(password);
        String message;
        if (score >= 80) {
            message = "Great password!";
        } else if (score >= 60) {
            message = "Good password!";
        } else if (score >= 40) {
            message = "Medium password!";
        } else {
            message = "Weak password!";
        }
        System.out.println(message);
    }

    public static String generatePassword(int passwordLength) {
        // Define the possible characters for each character category
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_+-=[]{}|;':\",./<>?";

        // Initialize the password builder and the random generator
        StringBuilder passwordBuilder = new StringBuilder();
        Random random = new Random();

        // Use all character categories for the password generation
        for (int i = 0; i < passwordLength; i++) {
            String charCategory = i % 4 == 0 ? uppercaseLetters : i % 4 == 1 ? lowercaseLetters : i % 4 == 2 ? numbers : symbols;
            passwordBuilder.append(charCategory.charAt(random.nextInt(charCategory.length())));
        }

        return passwordBuilder.toString();
    }

    public static int calculatePasswordScore(String password) {
        int score = 0;

        // Add points for the password length
        if (password.length() >= 8) {
            score += 10;
        }
        if (password.length() >= 16) {
            score += 10;
        }

        // Add points for the presence of uppercase letters, lowercase letters, numbers, and symbols
        if (password.matches(".*[A-Z].*")) {
            score += 10;
        }
        if (password.matches(".*[a-z].*")) {
            score += 10;
        }
        if (password.matches(".*\\d.*")) {
            score += 10;
        }
        if (password.matches(".*[!@#$%^&*()_+\\-=[\\]{}|;':\",]./<>?].*")) {
            score += 10;
        }

        return score;
    }
}
