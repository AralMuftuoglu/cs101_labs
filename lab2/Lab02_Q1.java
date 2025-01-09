import java.util.Scanner;
import java.lang.Math;

public class Lab02_Q1 {

    public static void main(String[] args) {

        double sphereVolume;
        double radius;
        double surfaceArea;

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter volume of sphere: ");

        sphereVolume = input.nextDouble();

        input.close();
        System.out.println();

        radius = Math.pow((sphereVolume * 3) / (4 * Math.PI), (double) 1 / 3);

        surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        System.out.printf("%-35s%15.1f%n", "The radius of the sphere is:", radius);
        System.out.printf("%-35s%15.1f", "The surface area of the sphere is:", surfaceArea);
        System.out.println();
    }

}
