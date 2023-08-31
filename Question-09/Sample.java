/*Write a program to receive a number and print the corresponding month name.
Example1)
C:\>java Sample 12
O/P Expected : December
Example2)
C:\>java Sample
O/P Expected: Please enter the month in numbers
Example3)
C:\>java Sample 15
O/P Expected: Invalid month
 */
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int monthNumber = scanner.nextInt();
            String monthName;
            switch (monthNumber) {
                case 1:
                    monthName = "January";
                    break;
                case 2:
                    monthName = "February";
                    break;
                case 3:
                    monthName = "March";
                    break;
                case 4:
                    monthName = "April";
                    break;
                case 5:
                    monthName = "May";
                    break;
                case 6:
                    monthName = "June";
                    break;
                case 7:
                    monthName = "July";
                    break;
                case 8:
                    monthName = "August";
                    break;
                case 9:
                    monthName = "September";
                    break;
                case 10:
                    monthName = "October";
                    break;
                case 11:
                    monthName = "November";
                    break;
                case 12:
                    monthName = "December";
                    break;
                default:
                    monthName = "Invalid month";
            }
            System.out.println(monthName);
        } else {
            System.out.println("Please enter the month in numbers");
        }

        scanner.close();
    }
}
