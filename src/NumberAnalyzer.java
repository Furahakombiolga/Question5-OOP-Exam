import java.util.Scanner;

public class NumberAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        int product = num1 * num2 * num3;
        int sum = num1 + num2 + num3;
        // Find maximum using Math.max
        int max = Math.max(Math.max(num1, num2), num3);

        System.out.println("\nProduct: " + product);
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);

        scanner.close();
    }
}
