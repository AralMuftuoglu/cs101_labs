package lab4;

import java.util.Scanner;

public class Lab04_Q3 {
    public static void main(String[] args) {

        int number;
        boolean exceedsEight = false;

        Scanner input = new Scanner(System.in);

        while (!exceedsEight) {
            int reversedNumber = 0;
            int sum = 0;
            int digitNo = 0;

            System.out.print("Enter a positive number: ");
            number = input.nextInt();

            int copyNumber = number;

            while (copyNumber != 0) {
                digitNo++;
                copyNumber = copyNumber / 10;
            }

            if (digitNo <= 8) {
                while (number != 0) {
                    sum = sum + number % 10;
                    reversedNumber = (reversedNumber * 10) + (number % 10);
                    number = number / 10;
                }
                System.out.println("Reversed number: " + reversedNumber);
                System.out.println("Sum of digits: " + sum);
            } else {
                exceedsEight = true;
                System.out.println("Number exceeds 8 digits.");
                System.out.println("Program finished.");
            }

            System.out.println();
        }
        input.close();
    }

}
