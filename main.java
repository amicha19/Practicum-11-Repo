// Practicum 11 (Largest of Three Program)
// (TO COMPLETE)

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // var declarations
        double num1, num2, num3, largest;

        // create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // prompt user for three numbers
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        num3 = scanner.nextDouble();

        // close the scanner to avoid resource leaks
        scanner.close();

        // determine largest and assign to variable largest
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // display results
        System.out.println("The largest of " + num1 + ", " + num2 +
                ", " + num3 + " is " + largest);
    }
}
