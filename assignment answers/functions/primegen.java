import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class primegen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower limit: ");
        int lowerLimit = scanner.nextInt();

        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        List<Integer> primeNumbers = generatePrimeNumbers(lowerLimit, upperLimit);

        System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + ":");
        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }

        scanner.close();
    }

    public static List<Integer> generatePrimeNumbers(int lowerLimit, int upperLimit) {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int number = lowerLimit; number <= upperLimit; number++) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }

        return primeNumbers;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
