import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        // Convert the string to lowercase to  make the checking case-insensitive
        String normalizedInput = input.toLowerCase();
        // Assume the string is a palindrome initially
        boolean isPalindrome = true;
        // Use a for loop to compare characters from both ends of the string
        int length = normalizedInput.length();
        for (int i = 0; i < length / 2; i++) {
            //Comparing the character from the start with the corresponding character from the end
            if (normalizedInput.charAt(i) != normalizedInput.charAt(length - 1 - i)) {
                //If any pair of characters don't match, it's not a palindrome
                isPalindrome = false;
                break;
            }
        }
        // Print the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        // Close the scanner
        scanner.close();
    }
}
