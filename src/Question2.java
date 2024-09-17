import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first positive integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second positive integer: ");
        int b = scanner.nextInt();


        if (a <= 0 || b <= 0) {
            System.out.println("Both numbers must be positive integers.");
            return;
        }

        int gcd = findGCD(a, b);

        System.out.println("The GCD of " + a + " and " + b + " is " + gcd + ".");

        scanner.close();
    }


    public static int findGCD(int a, int b) {

        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }
}