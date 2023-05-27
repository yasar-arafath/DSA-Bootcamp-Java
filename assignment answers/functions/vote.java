import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (isEligibleToVote(age)) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();
    }

    public static boolean isEligibleToVote(int age) {
        return age >= 18;
    }
}
