//write a program to print * in Floyd Format

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        int number = 1;

        System.out.println("Floyd's triangle pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                number++;
            }
            System.out.println();
        }

        scanner.close();
    }
}
