//Write a program to ask n number and print the sum square of first n natural numbers
import java.util.Scanner;
public class SquareofNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i * i;
        }
        System.out.println("Sum of square of first " + number + " natural numbers is " + sum);
    }
}
