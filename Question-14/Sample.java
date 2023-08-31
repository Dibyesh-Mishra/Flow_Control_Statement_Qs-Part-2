/*Write a program to print the sum of all the digits of a given number.

        Example1)

        I/P:1234

        O/P:10

 */


public class Sample {
    public static void main(String[] args) {
        int number = 1234; // The number to calculate the digit sum

        int sum = calculateDigitSum(number);

        System.out.println("Sum of digits of " + number + ": " + sum);
    }

    public static int calculateDigitSum(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit from the number
        }

        return sum;
    }
}

