import java.lang.Math;

public class Lab01_Q2 {
    public static void main(String[] args) {
        double result1;
        double result2;
        double result3;

        result1 = ((4.3 + 22) * (5.1 - 7.7)) / ((32.2 / 17) - 22);
        result2 = (Math.pow(2, 3) * (18 - 3.5 * 4.66)) / (Math.pow(2, 4) - 34);
        result3 = 3 * Math.pow((24 - 0.222), -1 / 6);

        System.out.println("Expression 1 evaluates to: " + result1);
        System.out.println("Expression 2 evaluates to: " + result2);
        System.out.println("Expression 3 evaluates to: " + result3);

    }
}
