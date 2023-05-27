import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in Indian Rupees: ");
        double rupees = scanner.nextDouble();

        double conversionRate = 0.014;

        double usd = rupees * conversionRate;

        System.out.println("Equivalent amount in USD: $" + usd);

        scanner.close();
    }
}
