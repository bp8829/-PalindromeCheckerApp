import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        String reversed = "";

        // Manual reverse using loop
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        boolean isPalindrome = text.equalsIgnoreCase(reversed);

        System.out.println("Entered Text: " + text);
        System.out.println("Reversed Text: " + reversed);
        System.out.println("Is it Palindrome? : " + isPalindrome);

        scanner.close();
    }

}
