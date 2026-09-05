/**
 * Question 3: How do you find the largest of three numbers?
 * Answer: Compare the values and keep the greatest one.
 */
public class Question03_LargestOfThree {
    public static void main(String[] args) {
        int first = 18;
        int second = 42;
        int third = 27;
        int largest = Math.max(first, Math.max(second, third));

        System.out.println("Largest number: " + largest);
    }
}