package lab4;

import java.util.Scanner;

public class Lab04_Q1 {

    public static void main(String[] args) {

        int number;
        boolean isPositive = true;

        Scanner input = new Scanner(System.in);

        while (isPositive) {
            int factorial = 1;// since 0 factorial is zero
            int i = 1;

            System.out.print("Enter a number: ");

            number = input.nextInt();

            if (number > 0) {
                while (i <= number) {
                    factorial = factorial * i;
                    i++;
                }
                System.out.println("Factorial of " + number + " is " + factorial);
            } else {
                System.out.println("Program is finished.");
                isPositive = false;
            }

            System.out.println();
        }
        input.close();
    }

}
