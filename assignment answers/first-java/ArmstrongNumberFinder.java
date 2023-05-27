import java.util.Scanner;

public class ArmstrongNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        for (int number = start; number <= end; number++) {
            if (isArmstrongNumber(number)) {
                System.out.println(number);
            }
        }

        scanner.close();
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int result = 0;
        int length = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, length);
            number /= 10;
        }

        return (result == originalNumber);
    }
}
