import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci Series up to " + n + " numbers: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        scanner.close();
    }
}
