/**
 * Question 5: How do you print the first n Fibonacci numbers?
 * Answer: Start with 0 and 1; each following number is the sum of the previous two.
 */
public class Question05_Fibonacci {
    public static void main(String[] args) {
        int count = 10;
        int previous = 0;
        int current = 1;

        for (int index = 0; index < count; index++) {
            System.out.print(previous);
            if (index < count - 1) {
                System.out.print(" ");
            }

            int next = previous + current;
            previous = current;
            current = next;
        }
        System.out.println();
    }
}