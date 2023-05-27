import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int factorial = calculateFactorial(number);

        System.out.println("Factorial: " + factorial);

        scanner.close();
    }

    public static int calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}