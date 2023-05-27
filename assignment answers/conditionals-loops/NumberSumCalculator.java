import java.util.Scanner;

public class NumberSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of numbers (enter 0 to terminate):");

        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            } else if (number < 0) {
                sumNegative += number;
            } else if (number % 2 == 0) {
                sumPositiveEven += number;
            } else {
                sumPositiveOdd += number;
            }
        }

        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);

        scanner.close();
    }
}
