import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
        // Example strings to test
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean isPalindrome = isPalindrome(str);
        System.out.println("Is \"" + str + "\" a palindrome? " + isPalindrome);
        
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        // Reverse the string
        String reversedStr = new StringBuilder(str).reverse().toString();

        // Check if the original string is equal to the reversed string
        return str.equals(reversedStr);
    }
}
