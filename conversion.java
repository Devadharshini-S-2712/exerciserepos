import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (num >= 1 && num <= 26) {
            char alphabet = (char) ('A' + num - 1); 
            System.out.println("Corresponding alphabet: " + alphabet);
        } else {
            System.out.println("Invalid input");
        }
    }
}