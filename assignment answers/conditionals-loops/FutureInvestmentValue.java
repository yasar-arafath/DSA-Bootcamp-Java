import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double futureValue = calculateFutureValue(principal, interestRate, years);

        System.out.println("Future investment value: " + futureValue);

        scanner.close();
    }

    public static double calculateFutureValue(double principal, double interestRate, int years) {
        double rate = interestRate / 100;
        return principal * Math.pow(1 + rate, years);
    }
}
