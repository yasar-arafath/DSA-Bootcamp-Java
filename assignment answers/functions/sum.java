import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = calculateSumOfNaturalNumbers(n);

        System.out.println("Sum of the first " + n + " natural numbers: " + sum);

        scanner.close();
    }

    public static int calculateSumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }
}
