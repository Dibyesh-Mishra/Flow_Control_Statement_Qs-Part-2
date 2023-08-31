/*write a program to reverse a given number and print

Example1)
I/P: 1234
O/P:4321
Example2)
I/P:1004
O/P:4001
 */


import java.util.Scanner;

public class Sample{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseNumber(number);

        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the number
        }

        return reversedNumber;
    }
}
