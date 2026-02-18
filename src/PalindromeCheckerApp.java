import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        String reversed = new StringBuilder(text).reverse().toString();

        boolean isPalindrome = text.equalsIgnoreCase(reversed);

        System.out.println("Entered Text: " + text);
        System.out.println("Is it Palindrome? : " + isPalindrome);

        scanner.close();
    }

}
