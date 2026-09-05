/**
 * Question 10: How do you swap two numbers without losing either value?
 * Answer: Store one value temporarily while assigning the other value.
 */
public class Question10_SwapNumbers {
    public static void main(String[] args) {
        int first = 10;
        int second = 25;
        int temporary = first;
        first = second;
        second = temporary;

        System.out.println("After swap: first = " + first + ", second = " + second);
    }
}