/**
 * Question 8: How do you check whether a string is a palindrome?
 * Answer: A palindrome reads the same forwards and backwards.
 */
public class Question08_Palindrome {
    public static void main(String[] args) {
        String text = "level";
        String reversed = new StringBuilder(text).reverse().toString();

        System.out.println(text + (text.equals(reversed)
                ? " is a palindrome."
                : " is not a palindrome."));
    }
}