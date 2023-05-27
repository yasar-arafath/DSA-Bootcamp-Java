import java.util.Scanner;

public class NcrNprCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();

        int ncr = calculateNcr(n, r);
        int npr = calculateNpr(n, r);

        System.out.println("Ncr: " + ncr);
        System.out.println("Npr: " + npr);

        scanner.close();
    }

    public static int calculateNcr(int n, int r) {
        int numerator = factorial(n);
        int denominator = factorial(r) * factorial(n - r);
        return numerator / denominator;
    }

    public static int calculateNpr(int n, int r) {
        int numerator = factorial(n);
        int denominator = factorial(n - r);
        return numerator / denominator;
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
