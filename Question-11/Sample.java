//Write a program to print even numbers between 23 and 57. Each number should be printed in a separate row.

public class Sample {
    public static void main(String[] args) {
        int start = 23;
        int end = 57;

        // Adjust the start if it's an odd number
        if (start % 2 != 0) {
            start++;
        }

        // Print the even numbers
        for (int i = start; i <= end; i += 2) {
            System.out.println(i);
        }
    }
}
