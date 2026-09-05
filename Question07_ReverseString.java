/**
 * Question 7: How do you reverse a string in Java?
 * Answer: StringBuilder provides a reverse method for this operation.
 */
public class Question07_ReverseString {
    public static void main(String[] args) {
        String text = "Java";
        String reversed = new StringBuilder(text).reverse().toString();

        System.out.println("Reversed text: " + reversed);
    }
}