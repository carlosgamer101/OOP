import java.util.Scanner;
public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word ");
        String s =  input.nextLine();

        if (isPalindrome(s))
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
