import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int lcm = calculateLCM(num1, num2);

        System.out.println("LCM of " + num1 + " and " + num2 + ": " + lcm);

        scanner.close();
    }

    public static int calculateLCM(int num1, int num2) {
        int max = Math.max(num1, num2);
        int lcm = max;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }
            lcm += max;
        }

        return lcm;
    }
}
