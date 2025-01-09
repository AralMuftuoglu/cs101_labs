package lab4;

import java.util.Scanner;

public class Lab04_Q2 {
    public static void main(String[] args) {

        int number;
        boolean isZero = false;

        Scanner input = new Scanner(System.in);

        while (!isZero) {
            int sum = 0;

            System.out.print("Enter a positive number: ");
            number = input.nextInt();

            if (number != 0) {
                while (number != 0) {
                    sum = sum + number % 10;
                    number = number / 10;
                }

                System.out.println("Sum of digits: " + sum);
            } else {
                isZero = true;
                System.out.println("Program finished.");

            }
            System.out.println();
        }
        input.close();
    }

}
