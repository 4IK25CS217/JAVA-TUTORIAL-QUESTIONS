/**
 * Question 9: How do you calculate the sum of an integer array?
 * Answer: Visit each element and add it to a running total.
 */
public class Question09_SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Array sum: " + sum);
    }
}