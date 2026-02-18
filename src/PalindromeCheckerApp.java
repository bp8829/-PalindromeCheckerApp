import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        // Convert string to character array
        char[] characters = text.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Entered Text: " + text);
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
