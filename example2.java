import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter last number: ");
        int num2 = scan.nextInt();
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        System.out.println("Enter a number to reverse:");
        int num3 = scan.nextInt();
        int reversed = 0;

        while (num3 != 0) {
            int perform = num3 % 10;
            reversed = reversed * 10 + perform;
            num3 = num3 / 10;
        }

        System.out.println("Reversed number: " + reversed);
        scan.close();
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}