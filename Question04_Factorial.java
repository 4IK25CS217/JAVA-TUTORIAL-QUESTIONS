/**
 * Question 4: How do you calculate the factorial of a number?
 * Answer: Multiply every integer from 1 through the given number.
 */
public class Question04_Factorial {
    public static void main(String[] args) {
        int number = 5;
        long factorial = 1;

        for (int value = 2; value <= number; value++) {
            factorial *= value;
        }

        System.out.println(number + "! = " + factorial);
    }
}