//Write a program to input number as paise and convert into rupees only
import java.util.Scanner;
public class Paise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in paise:");
        double paise = sc.nextDouble();
        double rupees = paise / 100;
        System.out.println("Amount in rupees is " + rupees);
    }
}
