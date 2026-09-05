/**
 * Question 2: How do you check whether a number is even or odd?
 * Answer: A number is even when its remainder after division by 2 is zero.
 */
public class Question02_EvenOrOdd {
    public static void main(String[] args) {
        int number = 42;
        String result = number % 2 == 0 ? "even" : "odd";
        System.out.println(number + " is " + result + ".");
    }
}