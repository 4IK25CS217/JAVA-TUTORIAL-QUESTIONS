/**
 * Question 6: How do you check whether a number is prime?
 * Answer: A prime number greater than 1 has no divisor other than 1 and itself.
 */
public class Question06_PrimeNumber {
    public static void main(String[] args) {
        int number = 29;
        boolean prime = isPrime(number);

        System.out.println(number + (prime ? " is prime." : " is not prime."));
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}