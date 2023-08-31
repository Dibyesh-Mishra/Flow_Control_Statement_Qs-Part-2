//Write a program to print prime numbers between 10 and 99.

public class Sample {
    public static void main(String[] args) {
        int start = 10; // The starting number
        int end = 99; // The ending number

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by i, hence not prime
            }
        }

        return true; // Number is not divisible by any number, hence prime
    }
}

