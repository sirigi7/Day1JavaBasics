import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a year (>= 1582): ");
        int year = scanner.nextInt();

        if (year < 1582) {
            System.out.println("Error: Year must be greater than or equal to 1582.");
        } else if (year % 4 != 0) {
            System.out.println(year + " is not a leap year.");
        } else if (year % 100 != 0) {
            System.out.println(year + " is a leap year.");
        } else if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
