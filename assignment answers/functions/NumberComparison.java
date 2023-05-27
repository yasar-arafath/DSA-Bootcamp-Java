import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int maximum = findMaximum(num1, num2, num3);
        int minimum = findMinimum(num1, num2, num3);

        System.out.println("Maximum number: " + maximum);
        System.out.println("Minimum number: " + minimum);

        scanner.close();
    }

    public static int findMaximum(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    public static int findMinimum(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }
}
