import java.util.Scanner;

public class nummul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int product = calculateProduct(num1, num2);

        System.out.println("Product: " + product);

        scanner.close();
    }

    public static int calculateProduct(int num1, int num2) {
        return num1 * num2;
    }
}
