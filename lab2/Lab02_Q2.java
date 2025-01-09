import java.util.Scanner;

public class Lab02_Q2 {
    public static void main(String[] args) {

        double firstWeight;
        double secondWeight;

        System.err.println();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight of first earthling (kg) : ");

        firstWeight = input.nextDouble();
        System.out.print("Enter weight of second earthling (kg) : ");

        secondWeight = input.nextDouble();

        input.close();

        System.out.println();

        System.out.printf("%46s%10s%10s%10s%n", "MERCURY", "VENUS", "MARS", "JUPITER");

        System.out.printf("%20s%5s%1s%18.1f%10.1f%10.1f%10.1f%n", "EARTHLING ONE(", firstWeight, "kg)",
                (firstWeight * 0.38), (firstWeight * 0.91), (firstWeight * 0.38), (firstWeight * 2.34));
        System.out.printf("%20s%5s%1s%18.1f%10.1f%10.1f%10.1f", "EARTHLING TWO(", secondWeight, "kg)",
                (secondWeight * 0.38), (secondWeight * 0.91), (secondWeight * 0.38), (secondWeight * 2.34));
        System.out.println();

    }
}
