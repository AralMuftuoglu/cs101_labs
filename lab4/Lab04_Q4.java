package lab4;

import java.util.Scanner;

public class Lab04_Q4 {
    public static void main(String[] args) {

        int number;
        String answer;
        boolean again = true;

        Scanner input = new Scanner(System.in);

        while (again) {
            int i = 1;
            int countPrimes = 0;
            int sumOfPrimes = 0;

            System.out.print("Enter a postive number: ");

            number = input.nextInt();

            System.out.print("Prime numbers: ");
            while (i <= number) {
                int z = 1;
                int noDivisor = 0;

                while (z <= i)// prime check
                {
                    if (i % z == 0) {
                        noDivisor++;
                    }
                    z++;
                }

                if (noDivisor == 2)// prime number
                {
                    countPrimes++;
                    sumOfPrimes = sumOfPrimes + i;
                    System.out.print(i + " ");
                }
                i++;
            }

            System.out.println();
            System.out.println("Sum of primes: " + sumOfPrimes);
            System.out.println("Count of primes: " + countPrimes);
            System.out.println();
            input.nextLine();
            System.out.print("Do you want to calculate again? (yes/no): ");
            answer = input.nextLine();

            if (answer.equals("no")) {
                again = false;
                System.out.println("Program finished.");
            }

        }
        input.close();
    }

}
